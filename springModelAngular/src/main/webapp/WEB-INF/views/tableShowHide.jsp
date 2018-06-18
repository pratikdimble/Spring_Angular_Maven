<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
      <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
      <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular-route.min.js"></script>
     <script  src = "resources/js/script.js"></script>
     <link href="resources/css/style.css" rel="stylesheet"/>
     <link href="resources/css/bootstrap.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-app="myModule">
		<div ng-controller="myController"></br></br/>
			Search Employee<input type="text" plceholder="search employee" ng-model="searchText.name"/>
			Search City<input type="text" plceholder="search city" ng-model="searchText.city"/>
			<input type="checkbox" ng-model="hide">Hide DOB
			<input type="checkbox" ng-model="show">Show City
			<br/><br/>
			<table>
				<thead>
					<tr>
						<th ng-click="sortData('name')">
							Name<div ng-class="getSortClass('name')"/>
						</th>
						<th ng-click="sortData('city')" ng-show="show">
							City<div ng-class="getSortClass('city')"/>
						</th>
						<th ng-click="sortData('gender')">
							Gender<div ng-class="getSortClass('gender')"/>
						</th>
						<th ng-click="sortData('salary')">
							Salary<div ng-class="getSortClass('salary')"/>
						</th>
						<th ng-click="sortData('dob')" >
							DOB<div ng-class="getSortClass('dob')"/>
						</th>
						<!-- <th>Name</th>
						<th>Gender</th>
						<th>Salary</th>
						<th>DOB</th> -->
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="employee in employees | orderBy:sortColumn:reverseSort | filter:searchText">
<!-- 					<tr ng-repeat="employee in employees | orderBy:'+name'"> -->
						<td>{{employee.name}}</td>
						<td ng-show="show">{{employee.city}}</td>
						<td>{{employee.gender}}</td>
						<td>{{employee.salary}}</td>
						<td ng-hide="hide">{{employee.dob|date:'dd/MM/yyyy'}}</td>
						<td ng-show="hide">##/##/####</td>
					</tr>
				</tbody>
			</table>
		</div>
			
</body>
</html>
