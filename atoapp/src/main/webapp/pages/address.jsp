<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>
<script>
$(document).ready(function() {
	  $("#address_form").validate({
		  rules:{
			  owner_hno:{
				  required: true,
				  minlength: 5
			  },
			  owner_streetNo:{
				  required: true,
				  number: true
			  },
			  owner_city:{
				  required: true,
				  minlength: 5
			  },
			  userCity:{
				  required: true,
				  minlength: 5
			  },
			  owner_state:{
				  required: true,
				  minlength: 5
			  },
			  owner_zip:{
				  required: true,
				  number: true
			  },
			  
			  }
		  }
	  });
	});
</script>
</head>
<body>
	<title>CSS Template</title>
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
	font-size: 25px;
	color: white;
}

/* Create two columns/boxes that floats next to each other */
/* Style the list inside the menu */
nav ul {
	list-style-type: none;
	padding: 0;
}

article {
	float: left;
	padding: 20px;
	width: 100%;
	background-color: #f1f1f1;
	text-align: center;
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

table {
	background-color: #777;
	padding: 10px;
	color: white;
	font-size:
}

label.error {
	color: red;
	font-size: 1rem;
	display: block;
	margin-top: 5px;
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
		<h2>Transport Department</h2>
	</header>

	<section>


		<article>
			<h1>New Vehicle Registration</h1>
			<br />
			<h2>Vehicle Owner Address Details</h2>
			<form id="address_form" action="storeOwnerAddress" method="post">
				<table align="center">
					<tr>
						<td>H. No.</td>
						<td><input type="text" name="owner_hno" size="30" required /></td>
					</tr>
					<tr>
						<td>Street No.</td>
						<td><input type="text" name="owner_streetNo" size="30"
							required /></td>
					</tr>
					<tr>
						<td>city Name</td>
						<td><input type="text" name="owner_city" size="30" required /></td>
					</tr>
					<tr>
						<td>State Name</td>
						<td><input type="text" name="owner_state" size="30" required /></td>
					</tr>
					<tr>
						<td>Zip Code</td>
						<td><input type="text" name="owner_zip" size="30" required /></td>
					</tr>
					<tr></tr>

					<tr>
						<td>
						<td><center>
								<input type="submit" value="Previous" name="previous_d" />
								 <input	type="submit" value="Next" name="next" />

							</center></td>
					</tr>
				</table>
			</form>
		</article>

	</section>

	<footer>
		<p>Web Site is designed by R.Paripoorna Chander & Company</p>
	</footer>

</body>
</html>
