<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Location</title>
</head>
<body>
<div id="master">
    <div id="form">
<form action="saveLoc" method="post">

    <div class="labels"><label for="id"  > Id:  </label></div> <div class="datos"><input id="id"   type="text" name="id"  ></div>
    <div class="labels"><label for="code"> Code:</label></div> <div class="datos"><input id="code" type="text" name="code"></div>
    <div class="labels"><label for="name"> Name:</label></div> <div class="datos"><input id="name" type="text" name="name"></div>

    <div class="labels">Type: </div><div  class="radiob">
                        Urban <input type="radio" name="type" value="URBAN">
                        Rural <input type="radio" name="type" value="RURAL">
                    </div>

    <div class="primary"><input type="Submit" value="Save" class="button"></div>

</form>
</div>
${msg}
</div>
<div id="lista">
    <a href="displayLocations">View All</a>
</div>
</body>
</html>