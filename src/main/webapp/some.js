window.onload = function() {
    fetch('/rest/echo')
        .then(r => r.json())
        .then(j => document.getElementById("1st").textContent = JSON.stringify(j, null, 4));

    fetch('https://localhost:8443/rest/echo')
        .then(r => r.json())
        .then(j => document.getElementById("3rd").textContent = JSON.stringify(j, null, 4));
}
