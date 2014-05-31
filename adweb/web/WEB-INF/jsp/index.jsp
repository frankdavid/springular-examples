<html>
<head>
    <title></title>
    <script type="text/javascript" src="remote/methods.js"></script>
</head>
<body>
Hello World. How are you?
<button onclick="long()">LONG</button>
<button onclick="short()">SHORT</button>

<script>
function long() {
    Remote.testService.getUser(function (user) {
        console.log("long is: " + user.name);
    });
}
function short() {
    Remote.testService.add(1, 2, function (result) {
        console.log("short is: " + result);
    });
}
</script>
</body>
</html>
