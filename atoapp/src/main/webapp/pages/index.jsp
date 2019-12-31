
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>
<script>
	$(document).ready(function() {
		$("#login_form").validate();
	});
</script>
</head>
<body>
	<title>Welcome Page</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<style>
* {
	box-sizing: border-box;
}

body {
	font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
	background-color: #666;
	padding: 30px;
	text-align: center;
	font-size: 35px;
	color: white;
}

/* Create two columns/boxes that floats next to each other */
nav {
	float: left;
	width: 60%;
	height: 600px; /* only for demonstration, should be removed */
	background: #ccc;
	padding: 20px;
}

/* Style the list inside the menu */
nav ul {
	list-style-type: none;
	padding: 0;
}

article {
	float: left;
	padding: 20px;
	width: 40%;
	background-color: #f1f1f1;
	height: 600px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section:after {
	content: "";
	display: table;
	clear: both;
}

/* Style the footer */
footer {
	background-color: #777;
	padding: 10px;
	text-align: center;
	color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media ( max-width : 600px) {
	nav, article {
		width: 100%;
		height: auto;
	}
}
</style>
</head>
<body>

	<header>
		<h2>Welcome to Transport Department of California State, USA</h2>
	</header>

	<section>
		<nav>
			<h1>List of Services</h1>
			<ol>
				<li>New Vehicle Registration</li>
				<li>Re-new of Old Vehicles</li>
				<li>Insurance</li>
				<li>Road Tax Payment</li>
				<li>Challan Payment</li>
			</ol>
		</nav>

		<article>
			<form action="checkDetails">

				<table hidden="true">
					<tr>
						<td>User Name</td>
						<td><input type="text" name="userName" /></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password" /></td>
					</tr>

				</table>
			</form>
			<table>
				<tr>
					<td><a href="forgotForm">Forgot Password</a></td>
				</tr>
				<tr>
					<td><a href="registerUser">New User / Register Now??</a></td>
				</tr>
			</table>
		</article>
	</section>

	<footer>
		<p>Web Site is designed by R.Paripoorna Chander & Company</p>
	</footer>
</body>
</html>
