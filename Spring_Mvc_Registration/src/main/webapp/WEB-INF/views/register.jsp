<%@page isELIgnored="false" %>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">

<%String data=(String)request.getAttribute("data"); %>
<div class="container">

	<div class="row justify-content-center">
		<div class="col-md-8">
			<div class="card">
				<header class="card-header">
					<a href="" class="float-right btn btn-outline-primary mt-1">Log
						in</a>
					<h4 class="card-title mt-2">Sign up</h4>
				</header>
				<article class="card-body">
					<form action="register" method="post">
						<div class="form-row">
							<div class="col form-group">
								<label>First name </label> <input type="text"
									class="form-control" placeholder="Enter First Name"
									name="fname">
							</div>
							<!-- form-group end.// -->
							<div class="col form-group">
								<label>Last name</label> <input type="text" class="form-control"
									placeholder="Enter Last Name" name="lname">
							</div>
							<!-- form-group end.// -->
							
						</div>
						<!-- form-row end.// -->
						<div class="form-row">
							<div class="col form-group">
								<label>Email address</label> <input type="email" name="email"
								class="form-control" placeholder="Enter Email">
							</div>
							<!-- form-group end.// -->
							<div class="col form-group">
								<label>DOB</label> <input type="text" class="form-control"
									placeholder="dd/MM/yyyy" name="date">
							</div>
							
							
						</div>
						<div class="form-row">
						<div class="col form-group">
							<label>Hobby &nbsp;&nbsp;&nbsp;</label> 
							<input type="checkbox" 
							name="hobby" value="cricket">Cricket
							<input type="checkbox" 
							name="hobby" value="hockey">Hockey
							<input type="checkbox"  
							name="hobby" value="chess">Chess
							</div>
							</div>
						<div class="form-row">
							<div class="col form-group">
							<label class="form-check form-check-inline"> <input
								class="form-check-input" type="radio" name="gender"
								value="Male"> <span class="form-check-label">
									Male </span>
							</label> <label class="form-check form-check-inline"> <input
								class="form-check-input" type="radio" name="gender"
								value="Female"> <span class="form-check-label">
									Female</span>
							</label>
							</div>
							<div class="col form-group">
							<label>Id</label> <input class="form-control"
								type="text" name="password">
						</div>
						</div>
						
						<div class="card">
						<div class="card-body">
						<p>Your Address</p>
					<div class="form-group">
						<input type="text" name="address.city" class="form-control"
						placeholder="Enter City">
					</div>
							
					<div class="form-group">
				<select id="inputState" name="address.country" class="form-control">
						<option>Choose...</option>
						<option>India</option>
						<option>America</option>
						<option selected="">Dubai</option>
				</select>
					</div>
					</div>
					</div>
						
						<br>
						<div class="form-group">
							<button type="submit" class="btn btn-primary btn-block">
								Register</button>
						</div>
						
					</form>
				</article>
				
			</div>
			<!-- card.// -->
		</div>
		<!-- col.//-->

	</div>
	<!-- row.//-->


</div>
