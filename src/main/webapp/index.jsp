<%@page contentType="text/html;charset=UTF-8" %>

<html>
<body>
<script src="js/jquery.js"></script>
<h2>Hello World!</h2>
<head>
    <title>hello</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<a href="./get_sessionkey.jsp"> click </a>
<a href="./get_phone_number.jsp">click2</a>
<a href="hello">hellos</a>>
${name}
<button onclick="abc()">abc click</button>
<button onclick="test2()">test2 click</button>
<div id="test">
test
</div>

<div id="hello">
hello
</div>
<script>
    function abc() {
        $.ajax({
            url: "hello",
            data: {
                sql: "this is sql test select * from test"
            },
            success(res) {
                $("#hello").html("hello"+res);
            }
        });

    }
    function test2() {
        $.ajax({
            url: "test2",
            data: {
                sql: "this is sql test select * from test2"
            },
            success(res) {
                $("#test").html(res);
            }
        });

    }
</script>


<div>
    name=${name}
</div>

</body>
</body>
</html>
