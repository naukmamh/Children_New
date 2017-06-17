<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html class="no-js">

<head>
    <title>Children</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,400,700|Yanone+Kaffeesatz" rel="stylesheet" type='text/css'>
    <link rel="stylesheet" href="<c:url value='/static/css/animate.css'/>">
    <link rel="stylesheet" href="<c:url value='/static/css/icomoon.css'/>">
    <link rel="stylesheet" href="<c:url value='/static/css/simple-line-icons.css'/>">
    <link rel="stylesheet" href="<c:url value='/static/css/owl.carousel.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/static/css/owl.theme.default.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/static/css/bootstrap.css'/>">
    <link rel="stylesheet" href="<c:url value='/static/css/hover.css'/>">

    <link rel="stylesheet" href="<c:url value='/static/css/style.css'/>">

</head>

<body>
    <header role="banner" id="fh5co-header">
        <div class="container">
            <nav class="navbar navbar-default">
                <div class="navbar-header">
                    <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"><i></i></a>
                    <a class="navbar-brand" href="index.html">Children</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="#" data-nav-section="home"><span>Головна</span></a></li>
                        <li><a href="#" data-nav-section="about"><span>Про нас</span></a></li>
                        <li><a href="#" data-nav-section="testimonials"><span>Як працює</span></a></li>
                        <li><a href="#" data-nav-section="press"><span>Діти</span></a></li>
                        <li><a href="#" class="login-btn hvr-reveal"><span>Увійти</span></a></li>
                    </ul>
                </div>
            </nav>
        </div>
    </header>

    <div id="slider" data-section="home">
        <div class="owl-carousel owl-carousel-fullwidth">
            <div class="item" style="background-image:url(<c:url value='/static/images/slide_1.png'/>)">
                <div class="container" style="position: relative;">
                    <div class="row">
                        <div class="col-md-7 col-sm-7">
                            <div class="fh5co-owl-text-wrap">
                                <div class="fh5co-owl-text">
                                    <h1 class="fh5co-lead to-animate">Разом ми можемо допомогти!</h1>
                                    <h2 class="fh5co-sub-lead to-animate">Не будь байдужим<br> Поділися частинкою радості з тими, хто її потребує</h2>
                                    <p class="to-animate-2"><a href="#" class="btn btn-primary btn-lg">Подарувати мрію</a></p>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>

            <div class="item" style="background-image:url(<c:url value='/static/images/slide_5.jpg)'/>">
                <div class="overlay"></div>
                <div class="container" style="position: relative;">
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2 text-center">
                            <div class="fh5co-owl-text-wrap">
                                <div class="fh5co-owl-text">
                                    <h1 class="fh5co-lead to-animate">Відео</h1>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="item" style="background-image:url(<c:url value='/static/images/donate.png'/>)">
                <div class="container" style="position: relative;">
                    <div class="row">
                        <div class="col-md-7 col-sm-7">
                            <div class="fh5co-owl-text-wrap">
                                <div class="fh5co-owl-text">
                                    <h1 class="fh5co-lead to-animate">Зацікавився?</h1>
                                    <p class="to-animate-2"><a href="#" class="btn btn-primary btn-lg">Приєднуйся!</a></p>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            

        </div>
    </div>

    <div id="fh5co-about-us" data-section="about">
        <div class="container">
            <div class="row row-bottom-padded-lg" id="about-us">
                <div class="col-md-12 section-heading text-center">
                    <h2 class="to-animate">Про нас</h2>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2 to-animate">
                            <h3>Подпись</h3>
                        </div>
                    </div>
                </div>
                <div class="col-md-8 to-animate">
                    <img src="<c:url value='/static/images/img_1.jpg'/>" class="img-responsive img-rounded">
                </div>
                <div class="col-md-4 to-animate">
                    <h2>Зачем мы это сделали</h2>
                    <p>типа много текста, зачем мы это делали</p>
                    <p><a href="#" class="btn btn-primary">Наша команда</a></p>
                </div>
            </div>
            <div class="row" id="team">
                <div class="col-md-12 section-heading text-center to-animate">
                    <h2>Наша команда</h2>
                </div>
                <div class="col-md-12">
                    <div class="row row-bottom-padded-lg">
                        <div class="col-md-4 text-center to-animate">
                            <div class="person">
                                <img src="http://i.imgur.com/AliJoXr.gif" class="img-responsive img-rounded" alt="Person">
                                <h3 class="name">Наталія Дранчук</h3>
                                <div class="position">Роль</div>
                                <p>Подпись</p>
                            </div>
                        </div>
                        <div class="col-md-4 text-center to-animate">
                            <div class="person">
                                <img src="http://data.whicdn.com/images/124857899/original.gif" class="img-responsive img-rounded" alt="Person">
                                <h3 class="name">Юлія Подпругіна</h3>
                                <div class="position">Роль</div>
                                <p>Подпись</p>
                            </div>
                        </div>
                        <div class="col-md-4 text-center to-animate">
                            <div class="person">
                                <img src="https://s-media-cache-ak0.pinimg.com/originals/7a/74/15/7a7415cff43a866092668e8c05f1b27e.gif" class="img-responsive img-rounded" alt="Person">
                                <h3 class="name">Олексій Ретізник</h3>
                                <div class="position">Роль</div>
                                <p>Подпись</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div id="fh5co-testimonials" data-section="testimonials">
        <div class="container">
            <div class="row">
                <div class="col-md-12 section-heading text-center">
                    <h2 class="to-animate">Як працює наш сервіс?</h2>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2 subtext to-animate">
                            <h3>Some text</h3>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <div class="box-testimony to-animate">
                            <img class="hvr-bounce-in" src="<c:url value='/static/images/girl.svg'/>"/>
                        <div class="circle hvr-bounce-in"></div>
                        <center>
                        <h2>Обирай дитину</h2>
                        </center>
                    </div>

                </div>
                <div class="col-md-4">
                    <div class="box-testimony to-animate">
                            <img class="hvr-bounce-in" src="<c:url value='/static/images/gift.svg'/>"/>
                         <div class="circle hvr-bounce-in"></div>
                        <center>
                        <h2>Допомагай</h2>
                        </center>
                        </div>


                </div>
                <div class="col-md-4">
                    <div class="box-testimony to-animate">
                        <img class="hvr-bounce-in" src="<c:url value='/static/images/pay-per-click.svg'/>"/>
                         <div class="circle hvr-bounce-in"></div>
                        <center>
                        <h2>Отримуй бонуси</h2>
                            </center>
                    </div>

                </div>
            </div>
        </div>
    </div>
    
        <div id="fh5co-press" data-section="press">
        <div class="container">
            <div class="row">
                <div class="col-md-12 section-heading text-center">
                    <h2 class="single-animate animate-press-1">Діти</h2>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2 subtext single-animate animate-press-2">
                            <h3>Оберіть дитину, якій бажаєте допомогти</h3>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <!-- Press Item -->
                    <div class="fh5co-press-item to-animate">
                        <div class="fh5co-press-img" style="background-image: url(http://www.pravsworld.com/wp-content/uploads/2013/12/Child-Smile-e1402671131894.jpg)">
                        </div>
                        <div class="fh5co-press-text">
                            <h3 class="h2 fh5co-press-title">Вася <span class="fh5co-border"></span></h3>
                            <h2 class="fh5co-press-title years">12 років</h2>
                            <p>Мріє про родину</p>
                            <p><a href="#" class="btn btn-primary btn-sm">Дізнатися більше</a></p>
                        </div>
                    </div>
                </div>

                <div class="col-md-6">
                    <!-- Press Item -->
                    <div class="fh5co-press-item to-animate">
                        <div class="fh5co-press-img" style="background-image: url(https://www.barnardos.org.uk/how-to-adopt-a-child-in-scotland-top-banner.jpg)">
                        </div>
                        <div class="fh5co-press-text" >
                            <h3 class="h2 fh5co-press-title">Катя <span class="fh5co-border"></span></h3>
                        <h2 class="fh5co-press-title years">10 років</h2>
                            <p>Любить малювати</p>
                            <p><a href="#" class="btn btn-primary btn-sm">Дізнатися більше</a></p>
                        </div>
                    </div>
                </div>
				<center>
                    <button class="btn btn-primary allchildren">Усі діти</button>
                </center>

            </div>
        </div>
    </div>

    <footer id="footer" role="contentinfo">
        <div class="container">
            <div class="row row-bottom-padded-sm">
                <div class="col-md-12">
                    <p class="copyright text-center">&copy; KMA 2017<br> Children web-project by <a href="#" target="_blank">Natalia, Julia, Oleksii</a></p>
                </div>
            </div>
        </div>
    </footer>

    <script src="<c:url value='/static/js/jquery.min.js'/>"></script>
    <script src="<c:url value='/static/js/jquery.easing.1.3.js'/>"></script>
    <script src="<c:url value='/static/js/bootstrap.min.js'/>"></script>
    <script src="<c:url value='/static/js/jquery.waypoints.min.js'/>"></script>
    <script src="<c:url value='/static/js/owl.carousel.min.js'/>"></script>
    <script src="<c:url value='/static/js/jquery.style.switcher.js'/>"></script>
    <script src="<c:url value='/static/js/main.js'/>"></script>

</body>

</html>
