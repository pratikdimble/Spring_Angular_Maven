<ul ng-repeat="employee in employees">
	<li>
		{{employee.name}}
			<ul>
				<li>
				{{employee.city}}
				</li>
				<li>
				{{employee.gender}}
				</li>
				<li>
				{{employee.dob |date:'dd/MM/yyyy'}}
				</li>
				<li>
				{{employee.salary}}
				</li>
			</ul>
	</li>
</ul>