window.onload = function() {
    fetch('/rest/echo')
        .then(r => r.json())
        .then(j => console.log(j));
}