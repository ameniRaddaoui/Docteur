
<!-- BEGIN HEADER-->
<header id="header">
	<div class="headerbar">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="headerbar-left">
			<ul class="header-nav header-nav-options">
				<li class="header-nav-brand">
					<div class="brand-holder">
						<span class="text-lg text-bold text-primary">Docteur en clic</span>
					</div>
				</li>
				<li><a class="btn btn-icon-toggle menubar-toggle"
					data-toggle="menubar" href="javascript:void(0);"> <i
						class="fa fa-bars"></i>
				</a></li>
			</ul>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="headerbar-right">
			<ul class="header-nav header-nav-options">
				<li></li>
				<!--end .dropdown -->
			</ul>
			<!--end .header-nav-options -->
			<ul class="header-nav header-nav-profile">
				<li class="dropdown"><a href="javascript:void(0);"
					class="dropdown-toggle ink-reaction" data-toggle="dropdown"> <img
						src="../../assets/img/avatar1.jpg?1403934956" alt="" /> <span
						class="profile-info"> <c:out
								value="${ userContext.personneCourante.name }" /> <small>Utilisateur</small>
					</span>
				</a>
					<ul class="dropdown-menu animation-dock">
						<li><a href="../../html/pages/profile.html">My profile</a></li>
						<li><a href="../../html/pages/calendar.html">Mes
								réservations</a></li>
						<li class="divider"></li>
						<li><a href="../../spring_security_logout"><i
								class="fa fa-fw fa-power-off text-danger"></i> Logout</a></li>
					</ul> <!--end .dropdown-menu --></li>
				<!--end .dropdown -->
			</ul>
			<!--end .header-nav-profile -->
		</div>
		<!--end #header-navbar-collapse -->
	</div>
</header>
<!-- END HEADER-->