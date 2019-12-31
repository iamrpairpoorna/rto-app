<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
<html>
<head>
</head>
<body>
<title>Preview Page</title>
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
@media (max-width: 600px) {
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
<form action="finalStep">
<h1>Check the details</h1><br><br>
<h3>Owner Details</h3><br>
<label>First Name:</label><label>${o.getOwner_fname()}</label><br>
<label>Last Name:</label><label>${o.getOwner_lname()}</label><br>
<label>Gender:</label><label>${o.getOwner_gender()}</label><br>
<label>DOB:</label><label>${o.getOwner_dob()}</label><br>
<label>Email:</label><label>${o.getOwner_email()}</label><br>
<label>Phone Number:</label><label>${o.getOwner_phno()}</label><br>
<label>SSN:</label><label>${o.getOwner_ssn()}</label><br><br>

<h3>Owner Address</h3><br>
<label>House No:</label><label>${od.getOwner_hno()}</label><br>
<label>Street No:</label><label>${od.getOwner_streetNo()}</label><br>
<label>City:</label><label>${od.getOwner_city()}</label><br>
<label>State:</label><label>${od.getOwner_state()}</label><br>
<label>Zip Code:</label><label>${od.getOwner_zip()}</label><br><br>

<h3>Vehicle Details</h3><br>
<label>Vehicle Type:</label><label>${vd.getVehicle_type()}</label><br>
<label>Vehicle Company:</label><label>${vd.getVehicle_company()}</label><br>
<label>Year of Purchase:</label><label>${vd.getVehicle_year() }</label><br><br><br>
<input type="submit" value="Previous" name="previous_p"/>
<input type="submit" value="Generate Regritration No." name="gen_regn"/>
</form>
<footer>
  <p>Web Site is designed by R.Paripoorna Chander  & Company</p>
</footer>

</body>
</html>
