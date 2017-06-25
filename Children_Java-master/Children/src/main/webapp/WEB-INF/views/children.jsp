<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    <link rel="stylesheet" href="<c:url value='/static/css/flat-ui.css'/>">
        <link rel="stylesheet" type="text/css" href="<c:url value='/static/css/default.css'/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/css/component.css'/>"/>

    <link rel="stylesheet" href="<c:url value='/static/css/style.css'/>">
    <link rel="stylesheet" href="<c:url value='/static/css/style-chp.css'/>">
    <link rel="stylesheet" href="<c:url value='/static/css/usertab.css'/>">
</head>
<body>
 <div class="usertab">
        <div class="img-border"></div>
        <div class="userpic"></div>
        <center>
        <div class="gifts-info"><div class="centered"><i class="fa fa-gift"></i><span>&nbsp;&nbsp;&nbsp;200 подарунків</span></div></div>
            </center>
        <ul class="btns">
        <li><a>Кабінет</a></li>
        <li><a>Вийти</a></li>
        </ul>
    </div>
	<header role="banner" id="fh5co-header">
        <div class="container">
            <nav class="navbar navbar-default">
                <div class="navbar-header">
                    <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"><i></i></a>
                    <a class="navbar-brand" href="index.html">Children</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#"><span>Головна</span></a></li>
                        <li><a href="#" class="login-btn hvr-reveal"><span>Увійти</span></a></li>
                        <li><a id="user-nav"><i class="fa fa-user-circle-o"></i></a></li>
                    </ul>
                </div>
            </nav>
        </div>
    </header>
    <img class="babyback" src="<c:url value='/static/images/back.png'/>"/>

    <div id="fh5co-press" data-section="press">
        <div class="container">
            <div class="row">
                <div class="col-md-12 section-heading text-center">
                    <h2 class="single-animate animate-press-1">Діти</h2>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2 subtext single-animate animate-press-2">
                            <div class="main clearfix">
				<form id="nl-form" class="nl-form" action="" method="get">
					Я хочу подарувати мрію
					<select name="sex">
						<option value="" selected>дитині</option>
						<option value="2">хлопчику</option>
						<option value="3">дівчинці</option>
					</select>
					<input name="age" class="years" type="text" value="" placeholder="будь-якого віку" data-subline="Наприклад: <em>від 5 до 9 років</em>"/>
					з <input  name="city" type="text" value="" placeholder="будь-якого міста" data-subline="Наприклад: <em>Київ</em> або <em>Львів</em>"/>
					<div class="nl-submit-wrap">
						<button class="nl-submit hvr-grow-rotate" type="submit">Знайти дитину</button>
					</div>
                    <div class="nl-overlay"></div>
				</form>
			</div>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="row">
            <c:if test="${fn:length(children) == 0}">
            <center>
            	<h4 class="not-found">На жаль, за таким запитом нічого не знайдено</h4>
            	</center>
            </c:if>
            
            <c:forEach items="${children}" var="child">
                <div class="col-md-6">
                    <div class="fh5co-press-item to-animate">
                        <div class="fh5co-press-img" style="background-image: url(http://www.pravsworld.com/wp-content/uploads/2013/12/Child-Smile-e1402671131894.jpg)">
                        </div>
                        <div class="fh5co-press-text">
                            <h3 class="h2 fh5co-press-title">${child.firstName} <span class="fh5co-border"></span></h3>
                            <h2 class="fh5co-press-title years">12 років</h2>
                            <p>Мріє про родину</p>
                            <p><a href="child?id=${child.id}" class="btn btn-primary btn-sm">Дізнатися більше</a></p>
                        </div>
                        
                    </div>
                </div>
                </c:forEach>


                <center>

                    <div>
                        <ul class="pagination to-animate">
                            <li class="previous">
                                <a href="#fakelink" class="fui-arrow-left">Попередня</a>
                            </li>
                            <li class="active"><a href="#fakelink">1</a></li>
                            <li class="hvr-sink"><a href="#fakelink">2</a></li>
                            <li class="hvr-sink"><a href="#fakelink">3</a></li>
                            <li class="hvr-sink"><a href="#fakelink">4</a></li>
                            <li class="hvr-sink"><a href="#fakelink">5</a></li>
                            <li class="hvr-sink"><a href="#fakelink">6</a></li>
                            <li class="hvr-sink"><a href="#fakelink">7</a></li>
                            <li class="hvr-sink"><a href="#fakelink">8</a></li>
                            <li class="next">
                                <a href="#fakelink" class="fui-arrow-right">Наступна</a>
                            </li>
                        </ul>
                    </div>
                </center>
            </div>
        </div>
    </div>

    <footer id="footer" role="contentinfo">
        <div class="container">
            <div class="row row-bottom-padded-sm">
                <div class="col-md-12">
                    <p class="copyright text-center">&copy; KMA 2017<br> Children web-project by <a href="https://github.com/natalya118/Children_New" target="_blank">Natalia, Julia, Oleksii</a></p>
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
    <script src="<c:url value='/static/js/nlform.js'/>"></script>
    <script src="<c:url value='/static/js/usertab.js'/>"></script>
    <script>
        var nlform = new NLForm(document.getElementById('nl-form'));
    </script>
</body>
</html>