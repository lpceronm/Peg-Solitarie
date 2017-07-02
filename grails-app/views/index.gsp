<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Peg Solitaire</title>

    <!-- Bootstrap Core CSS -->
    <link href="${assetPath (src: 'bootstrap.min.css')}" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="${assetPath (src: 'freelancer.min.css')}" rel="stylesheet">
    
    <link href="${assetPath (src: 'circle.css')}" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top" class="index" onload="init()">
<div id="skipnav"><a href="#maincontent">Skip to main content</a></div>

    <!-- Navigation -->
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="#page-top">Peg Solitaire</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li class="page-scroll">
                        <a href="#portfolio">Game</a>
                    </li>
                    <li class="page-scroll">
                        <a href="#about">Rules</a>
                    </li>
                    <li class="page-scroll">
                        <a href="#contact">Source Code</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- Header -->
    <header>
        <div class="container" id="maincontent" tabindex="-1">
            <div class="row">
                <div class="col-lg-12">
                    
                    <div class="intro-text">
                        <h1 class="name">Peg Solitaire</h1>
                        <hr class="star-light">
                        <span class="skills">Laura Cerón M. - Camilo A. Dajer P. - Richard O. Herrera P.</span>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- Portfolio Grid Section -->
    <section id="portfolio">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Game</h2>
                    <hr class="star-primary">
                </div>
            </div>
            <div class="row" align="center">

				<div class="col-sm-10">	
					<!-- First Row -->
					<div class="col-md-2"><br></div>
					<div class="col-md-1"><button onclick="btn_click('b00');" type="button" class="btn btn-default btn-circle b00" style="background-color:white"></button></div>
					<div class="col-md-1"><button onclick="btn_click('b01');" type="button" class="btn btn-default btn-circle b01" style="background-color:white"></button></div>
					<div class="col-md-1"><button onclick="btn_click('b02');" type="button" class="btn btn-default btn-circle b02" style="background-color:gray"></button></div>
					<div class="col-md-1"><button onclick="btn_click('b03');" type="button" class="btn btn-default btn-circle b03" style="background-color:gray"></button></div>
					<div class="col-md-1"><button onclick="btn_click('b04');" type="button" class="btn btn-default btn-circle b04" style="background-color:gray"></button></div>
					<div class="col-md-1"><button onclick="btn_click('b05');" type="button" class="btn btn-default btn-circle b05" style="background-color:white"></button></div>
					<div class="col-md-1"><button onclick="btn_click('b06');" type="button" class="btn btn-default btn-circle b06" style="background-color:white"></button></div>
					<div class="col-md-3"><br><br><br></div>
					
					<!-- Second Row -->
					<div class="col-sm-2"></div>
					<div class="col-sm-1"><button onclick="btn_click('b10');" type="button" class="btn btn-default btn-circle b10" style="background-color:white"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b11');" type="button" class="btn btn-default btn-circle b11" style="background-color:white"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b12');" type="button" class="btn btn-default btn-circle b12" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b13');" type="button" class="btn btn-default btn-circle b13" style="background-color:black"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b14');" type="button" class="btn btn-default btn-circle b14" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b15');" type="button" class="btn btn-default btn-circle b15" style="background-color:white"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b16');" type="button" class="btn btn-default btn-circle b16" style="background-color:white"></button></div>
					<div class="col-md-3"><br><br><br></div>
									
					<!-- Third Row -->
					<div class="col-sm-2"></div>
					<div class="col-sm-1"><button onclick="btn_click('b20');" type="button" class="btn btn-default btn-circle b20" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b21');" type="button" class="btn btn-default btn-circle b21" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b22');" type="button" class="btn btn-default btn-circle b22" style="background-color:black"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b23');" type="button" class="btn btn-default btn-circle b23" style="background-color:black"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b24');" type="button" class="btn btn-default btn-circle b24" style="background-color:black"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b25');" type="button" class="btn btn-default btn-circle b25" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b26');" type="button" class="btn btn-default btn-circle b26" style="background-color:gray"></button></div>
					<div class="col-md-3"><br><br><br></div>
					
					
					<!-- Fourth Row -->
					<div class="col-sm-2"></div>
					<div class="col-sm-1"><button onclick="btn_click('b30');" type="button" class="btn btn-default btn-circle b30" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b31');" type="button" class="btn btn-default btn-circle b31" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b32');" type="button" class="btn btn-default btn-circle b32" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b33');" type="button" class="btn btn-default btn-circle b33" style="background-color:black"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b34');" type="button" class="btn btn-default btn-circle b34" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b35');" type="button" class="btn btn-default btn-circle b35" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b36');" type="button" class="btn btn-default btn-circle b36" style="background-color:gray"></button></div>
					<div class="col-md-3"><br><br><br></div>
					
					
					<!-- Fifth Row -->
					<div class="col-sm-2"></div>
					<div class="col-sm-1"><button onclick="btn_click('b40');" type="button" class="btn btn-default btn-circle b40" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b41');" type="button" class="btn btn-default btn-circle b41" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b42');" type="button" class="btn btn-default btn-circle b42" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b43');" type="button" class="btn btn-default btn-circle b43" style="background-color:black"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b44');" type="button" class="btn btn-default btn-circle b44" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b45');" type="button" class="btn btn-default btn-circle b45" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b46');" type="button" class="btn btn-default btn-circle b46" style="background-color:gray"></button></div>
					<div class="col-md-3"><br><br><br></div>
					
					
					<!-- Sixth Row -->
					<div class="col-sm-2"></div>
					<div class="col-sm-1"><button onclick="btn_click('b50');" type="button" class="btn btn-default btn-circle b50" style="background-color:white"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b51');" type="button" class="btn btn-default btn-circle b51" style="background-color:white"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b52');" type="button" class="btn btn-default btn-circle b52" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b53');" type="button" class="btn btn-default btn-circle b53" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b54');" type="button" class="btn btn-default btn-circle b54" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b55');" type="button" class="btn btn-default btn-circle b55" style="background-color:white"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b56');" type="button" class="btn btn-default btn-circle b56" style="background-color:white"></button></div>
					<div class="col-md-3"><br><br><br></div>
					
					<!-- Seventh Row -->
					<div class="col-sm-2"></div>
					<div class="col-sm-1"><button onclick="btn_click('b60');" type="button" class="btn btn-default btn-circle b60" style="background-color:white"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b61');" type="button" class="btn btn-default btn-circle b61" style="background-color:white"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b62');" type="button" class="btn btn-default btn-circle b62" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b63');" type="button" class="btn btn-default btn-circle b63" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b64');" type="button" class="btn btn-default btn-circle b64" style="background-color:gray"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b65');" type="button" class="btn btn-default btn-circle b65" style="background-color:white"></button></div>
					<div class="col-sm-1"><button onclick="btn_click('b66');" type="button" class="btn btn-default btn-circle b66" style="background-color:white"></button></div>
					<div class="col-md-3"><br><br><br></div>

				</div>

				<div class="col-sm-1">
				
					<div class="row" align="center">
		            	<div class="col-lg-8 col-lg-offset-2">
		                    <a id="change" class="btn btn-lg btn-success">
		                        Pyramid
		                    </a>
		                </div>
		                <div class="col-lg-12 col-lg-offset-2"><br></div>
		                <div class="col-lg-8 col-lg-offset-2">
		                    <a id="undo" class="btn btn-lg btn-warning">
		                        Undo
		                    </a>
		                </div>
		                <div class="col-lg-12 col-lg-offset-2"><br></div>
		            	<div class="col-lg-8 col-lg-offset-2">
		                    <a onClick="window.location.reload();" class="btn btn-lg btn-danger">
		                        <i class="fa fa-download"></i> Restart
		                    </a>
		                </div>
		                <!-- <div class="col-lg-12 col-lg-offset-2"><br></div>
		          		<div class="col-lg-8 col-lg-offset-2">
		                    <a href="https://github.com/trum7/Peg-Solitarie" class="btn btn-lg btn-primary">
		                        <i class="fa fa-download"></i> Undo
		                    </a>
		                </div> -->
		               	<div class="col-lg-12 col-lg-offset-2"><br><br></div>
		          		<div class="col-lg-8 col-lg-offset-2" >
		                    <h4>Movements</h4>
		                </div>
		          		<div class="col-lg-8 col-lg-offset-2" align="center" id="content">
		                    <h2 id="score">0</h2>
		                </div>
		            </div>
				
				</div>
				
				<div id="valid" class="col-sm-12">
					<h2>Movements</h2>
					
				</div>
				
            </div>
        </div>
    </section>

    <!-- About Section -->
    <section class="success" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Rules</h2>
                    <hr class="star-light">
                </div>
            </div>
            <div class="row" align="justify">
                <div class="col-lg-8 col-lg-offset-2">
                    <p>The goal is to have just one peg left on the board... in as few of moves as possible!
A peg can only move by jumping over an adjacent peg (that's a peg that's right next to it.) The peg being jumped over will disappear.</p>
                </div>
            </div>
        </div>
    </section>

    <!-- Contact Section -->
    <section id="contact" style="background-color: #cfeff0">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Source Code</h2>
                    
                </div>
            </div>
            <div class="row" align="center">
            
            	<div class="col-lg-8 col-lg-offset-2 text-center">
                    <a href="https://github.com/trum7/Peg-Solitarie" class="btn btn-lg btn-outline" style="color: black; background-color: #2C3E50">
                        <i class="fa fa-download"></i> GitHub
                    </a>
                </div>
            </div>
        </div>
    </section>

    <!-- Footer -->
    <footer class="text-center">
        <div class="footer-above">
            <div class="container">
                <div class="row">
                	<div class="footer-col col-md-1"></div>
                    <div class="footer-col col-md-10">
                        <h2>Software maintenance, evolution and re-engineering</h2>
                        <p>Universidad Nacional de Colombia</p>
                    </div>
                    <div class="footer-col col-md-1"></div>
                </div>
            </div>
        </div>
        <div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        Copyright &copy; Peg Solitaire 2017
                    </div>
                </div>
            </div>
        </div>
    </footer>

    <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
    <div class="scroll-top page-scroll hidden-sm hidden-xs hidden-lg hidden-md">
        <a class="btn btn-primary" href="#page-top">
            <i class="fa fa-chevron-up"></i>
        </a>
    </div>

    <!-- Portfolio Modals -->
    <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-content">
            <div class="close-modal" data-dismiss="modal">
                <div class="lr">
                    <div class="rl">
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="modal-body">
                            <h2>Project Title</h2>
                            <hr class="star-primary">
                            <img src="img/portfolio/cabin.png" class="img-responsive img-centered" alt="">
                            <p>Use this area of the page to describe your project. The icon above is part of a free icon set by <a href="https://sellfy.com/p/8Q9P/jV3VZ/">Flat Icons</a>. On their website, you can download their free set with 16 icons, or you can purchase the entire set with 146 icons for only $12!</p>
                            <ul class="list-inline item-details">
                                <li>Client:
                                    <strong><a href="http://startbootstrap.com">Start Bootstrap</a>
                                    </strong>
                                </li>
                                <li>Date:
                                    <strong><a href="http://startbootstrap.com">April 2014</a>
                                    </strong>
                                </li>
                                <li>Service:
                                    <strong><a href="http://startbootstrap.com">Web Development</a>
                                    </strong>
                                </li>
                            </ul>
                            <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="portfolio-modal modal fade" id="portfolioModal2" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-content">
            <div class="close-modal" data-dismiss="modal">
                <div class="lr">
                    <div class="rl">
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="modal-body">
                            <h2>Project Title</h2>
                            <hr class="star-primary">
                            <img src="img/portfolio/cake.png" class="img-responsive img-centered" alt="">
                            <p>Use this area of the page to describe your project. The icon above is part of a free icon set by <a href="https://sellfy.com/p/8Q9P/jV3VZ/">Flat Icons</a>. On their website, you can download their free set with 16 icons, or you can purchase the entire set with 146 icons for only $12!</p>
                            <ul class="list-inline item-details">
                                <li>Client:
                                    <strong><a href="http://startbootstrap.com">Start Bootstrap</a>
                                    </strong>
                                </li>
                                <li>Date:
                                    <strong><a href="http://startbootstrap.com">April 2014</a>
                                    </strong>
                                </li>
                                <li>Service:
                                    <strong><a href="http://startbootstrap.com">Web Development</a>
                                    </strong>
                                </li>
                            </ul>
                            <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-content">
            <div class="close-modal" data-dismiss="modal">
                <div class="lr">
                    <div class="rl">
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="modal-body">
                            <h2>Project Title</h2>
                            <hr class="star-primary">
                            <img src="img/portfolio/circus.png" class="img-responsive img-centered" alt="">
                            <p>Use this area of the page to describe your project. The icon above is part of a free icon set by <a href="https://sellfy.com/p/8Q9P/jV3VZ/">Flat Icons</a>. On their website, you can download their free set with 16 icons, or you can purchase the entire set with 146 icons for only $12!</p>
                            <ul class="list-inline item-details">
                                <li>Client:
                                    <strong><a href="http://startbootstrap.com">Start Bootstrap</a>
                                    </strong>
                                </li>
                                <li>Date:
                                    <strong><a href="http://startbootstrap.com">April 2014</a>
                                    </strong>
                                </li>
                                <li>Service:
                                    <strong><a href="http://startbootstrap.com">Web Development</a>
                                    </strong>
                                </li>
                            </ul>
                            <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="portfolio-modal modal fade" id="portfolioModal4" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-content">
            <div class="close-modal" data-dismiss="modal">
                <div class="lr">
                    <div class="rl">
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="modal-body">
                            <h2>Project Title</h2>
                            <hr class="star-primary">
                            <img src="img/portfolio/game.png" class="img-responsive img-centered" alt="">
                            <p>Use this area of the page to describe your project. The icon above is part of a free icon set by <a href="https://sellfy.com/p/8Q9P/jV3VZ/">Flat Icons</a>. On their website, you can download their free set with 16 icons, or you can purchase the entire set with 146 icons for only $12!</p>
                            <ul class="list-inline item-details">
                                <li>Client:
                                    <strong><a href="http://startbootstrap.com">Start Bootstrap</a>
                                    </strong>
                                </li>
                                <li>Date:
                                    <strong><a href="http://startbootstrap.com">April 2014</a>
                                    </strong>
                                </li>
                                <li>Service:
                                    <strong><a href="http://startbootstrap.com">Web Development</a>
                                    </strong>
                                </li>
                            </ul>
                            <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="portfolio-modal modal fade" id="portfolioModal5" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-content">
            <div class="close-modal" data-dismiss="modal">
                <div class="lr">
                    <div class="rl">
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="modal-body">
                            <h2>Project Title</h2>
                            <hr class="star-primary">
                            <img src="img/portfolio/safe.png" class="img-responsive img-centered" alt="">
                            <p>Use this area of the page to describe your project. The icon above is part of a free icon set by <a href="https://sellfy.com/p/8Q9P/jV3VZ/">Flat Icons</a>. On their website, you can download their free set with 16 icons, or you can purchase the entire set with 146 icons for only $12!</p>
                            <ul class="list-inline item-details">
                                <li>Client:
                                    <strong><a href="http://startbootstrap.com">Start Bootstrap</a>
                                    </strong>
                                </li>
                                <li>Date:
                                    <strong><a href="http://startbootstrap.com">April 2014</a>
                                    </strong>
                                </li>
                                <li>Service:
                                    <strong><a href="http://startbootstrap.com">Web Development</a>
                                    </strong>
                                </li>
                            </ul>
                            <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="portfolio-modal modal fade" id="portfolioModal6" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-content">
            <div class="close-modal" data-dismiss="modal">
                <div class="lr">
                    <div class="rl">
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="modal-body">
                            <h2>Project Title</h2>
                            <hr class="star-primary">
                            <img src="img/portfolio/submarine.png" class="img-responsive img-centered" alt="">
                            <p>Use this area of the page to describe your project. The icon above is part of a free icon set by <a href="https://sellfy.com/p/8Q9P/jV3VZ/">Flat Icons</a>. On their website, you can download their free set with 16 icons, or you can purchase the entire set with 146 icons for only $12!</p>
                            <ul class="list-inline item-details">
                                <li>Client:
                                    <strong><a href="http://startbootstrap.com">Start Bootstrap</a>
                                    </strong>
                                </li>
                                <li>Date:
                                    <strong><a href="http://startbootstrap.com">April 2014</a>
                                    </strong>
                                </li>
                                <li>Service:
                                    <strong><a href="http://startbootstrap.com">Web Development</a>
                                    </strong>
                                </li>
                            </ul>
                            <button id="btnSubmit" type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- jQuery -->
    <script src="${assetPath (src: 'jquery.min.js')}"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${assetPath (src: 'bootstrap.min.js')}"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Theme JavaScript -->
    <script src="${assetPath (src: 'freelancer.min.js')}"></script>
    <script src="${assetPath (src: 'game.js')}"></script>
    <script src="${assetPath (src: 'template.js')}"></script>
	<script>localStorage.selected=None;</script>
	<script>
		function back(p1, p2) {
			//alert("listo");
			
    		<g:remoteFunction controller="move" action="movement" params="'fromM='+p1+'&'+'toM='+p2"/>             			 
		
		}
	</script>
</body>

</html>
