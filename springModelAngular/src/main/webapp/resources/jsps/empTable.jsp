
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
