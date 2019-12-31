<html>
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
			<h2>Vehicle Details</h2>
			<form action="storeVehicleDetails" method="post">
				<table align="center">
					<tr>
						<td>No. of Wheels</td>
						<td><select name="vehicle_type">
								<option value="2">2</option>
								<option value="4">4</option>
								<option value="6">6</option>
						</select></td>
					</tr>
					<tr>
						<td>Company</td>
						<td><select name="vehicle_company">
								<option value="Hero">Hero</option>
								<option value="Honda">Honda</option>
								<option value="Bajaj">Bajaj</option>
								<option value="TVS">TVS</option>
								<option value="Royal Enfeild">Royal Enfeild</option>
								<option value="Mahindra">Mahindra</option>
								<option value="Hyndai">Hyndai</option>
								<option value="Maruthi">Maruthi</option>
								<option value="Toyota">Toyota</option>
								<option value="KIA">KIA</option>
								<option value="BMW">BMW</option>
								<option value="Ashok Leyland">Ashok Leyland</option>
								<option value="TATA Motors">TATA Motors</option>

						</select></td>
					</tr>
					<tr>
						<td>Year</td>
						<td><select name="vehicle_year">
								<option value="2014">2014</option>
								<option value="2015">2015</option>
								<option value="2016">2016</option>
								<option value="2017">2017</option>
								<option value="2018">2018</option>
								<option value="2019">2019</option>
						</select></td>
					</tr>
					
					<tr>
						<td>
						<td><center>
								<input type="submit" value="Previous" name="previous_v"/>
								 <input type="submit" value="Next" name="next"/>
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
