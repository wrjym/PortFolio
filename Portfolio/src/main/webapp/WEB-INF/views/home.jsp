<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<script src="https://cdn.jsdelivr.net/npm/vue"></script>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	<div id = "app">
		{{message}}
	</div>
</h1>
<script>
	var app = new Vue({
		el: '#app',
		data : {
			message : "Hello Vue!"
		}
	})
</script>
</body>
</html>
