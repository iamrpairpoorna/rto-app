<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>
<script>
	$(document)
			.ready(
					function() {
						$('#userSSD1,#userSSD2,#userSSD3').keyup(
								function(e) {
									if ($(this).val().length == $(this).attr(
											'maxlength'))
										$(this).next(':input').focus()
								});
						$("#register_form")
								.validate(
										{
											rules : {
												owner_fname : {
													required : true,
													minlength : 5
												},
												owner_lname : {
													required : true,
												},
												owner_gender : {
													required : true
												},
												owner_dob : {
													required : true,
													date : true
												},

												owner_email : {
													required : true,
													email : true
												},
												owner_phno : {
													required : true,
													number : true
												},
												owner_ssn : {
													required : true,
													number : true
												},
												messages : {
													userFName : {
														minlength : "first name should be atleast 3 characters"
													},
													owner_lname : {
														minlenght : "middle name should be atleast 3 characters"
													},
													owner_phno : {
														number : "please enter phone number as a numerical"
													},
													owner_ssn : {
														required : "please enter SSN , it is mandatory",
														number : "please enter SSN number as a numerical"
													}
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

input.error, textarea.error {
	border: 1px dashed red;
	font-weight: 300;
	color: red;
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
			<h2>Vehicle Owner Details</h2>
			<form id="register_form" action="storeOwnerDetails" method="post">
				<table align="center">
					<tr>
						<td>First Name</td>
						<td><input type="text" name="owner_fname" size="30" /></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><input type="text" name="owner_lname" size="30" /></td>

					</tr>
					<tr>
						<td>Gender</td>
						<td><input type="radio" name="owner_gender" value="male">
							Male <input type="radio" name="owner_gender" value="female">
							Female <input type="radio" name="owner_gender" value="other">
							Other</td>

					</tr>
					<tr>
						<td>Date Of Birth</td>
						<td><input type="date" name="owner_dob"
							placeholder="dd/mm/yyyy"></td>
					</tr>
					<tr>
						<td>Email Id:</td>
						<td><input type="mail" name="owner_email" size="30" /></td>
					</tr>
					<tr>
						<td>Phone Number:</td>
						<td><input type="text" name="owner_phno" size="30" /></td>
					</tr>
					<tr>
						<td>SSN</td>
						<td><input type="text" id="userSSD1" name="owner_ssn"
							maxlength="3" size="3" required /> <input type="text"
							id="userSSD2" name="owner_ssn" maxlength="2" size="2" required />
							<input type="text" id="userSSD3" name="owner_ssn" maxlength="4"
							size="4" required /></td>

					</tr>
					<tr></tr>
					<tr></tr>
					<tr>
						<td>
						<td><center>
								<input class=".submit" type="submit" value="Next">
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
