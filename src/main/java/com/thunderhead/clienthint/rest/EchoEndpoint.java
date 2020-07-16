package com.thunderhead.clienthint.rest;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.*;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


@Path("/echo")
public class EchoEndpoint {
    @Context
    private HttpServletRequest request;

    @Context
    private HttpServletResponse response;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> doGet() {
        setHeader("Brownie", String.valueOf(System.currentTimeMillis()));
        setHeader("Access-Control-Allow-Origin", "*");
        return enumerationAsStream(request.getHeaderNames())
                .collect(Collectors.toMap(
                        k -> k,
                        request::getHeader,
                        (a, b) -> b
                ));
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> doPost(@Context Request request) {
        return doGet();
    }


    /*
     * HELPERS
     */

    private void setHeader(String name, String value) {
        response.setHeader(name, value);
    }

    private static <T> Stream<T> enumerationAsStream(Enumeration<T> e) {
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(
                        new Iterator<T>() {
                            @Override
                            public boolean hasNext() {
                                return e.hasMoreElements();
                            }

                            @Override
                            public T next() {
                                return e.nextElement();
                            }
                        },
                        Spliterator.ORDERED
                ),
                false
        );
    }
}
