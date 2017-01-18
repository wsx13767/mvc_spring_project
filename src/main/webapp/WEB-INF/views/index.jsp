<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome</title>
<jsp:include page="jsp/fragments/scriptInclude.jsp" />
<jsp:include page="jsp/fragments/cssInclude.jsp" />
</head>
<body>
	<div id="test"></div>
	<!-- header -->
	<jsp:include page="jsp/fragments/header.jsp" />
	<!-- 跑馬燈 -->
	<jsp:include page="jsp/fragments/slider.jsp" />
	<!--/slider-->

	<section>
		<div class="container">
			<!-- menu -->
			<jsp:include page="jsp/fragments/menu.jsp" />

			<div class="col-sm-9 padding-right">
				<div class="features_items">
					<!--features_items-->
					<h2 class="title text-center">Features Items</h2>
					<c:forEach items="${list}" var="item">
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="resources/images/home/${item.image}" style="width: 268px;height: 249px;" alt="" />
										<h2>${item.product_money}</h2>
										<p>${item.product_name}</p>
										<a class="btn btn-default add-to-cart"><i
											class="fa fa-shopping-cart"></i>Add to cart</a>
									</div>
									<div class="product-overlay">
										<div class="overlay-content">
											<h2>${item.product_money}</h2>
											<p>${item.product_name}</p>
											<form class="productForm${item.order_id}" action="/training-project/product">
											<input name="orderId" type="hidden" value="${item.order_id}">
											</form>
											<a class="btn btn-default add-to-cart" onclick="detail(${item.order_id});">
											<i class="fa fa-shopping-cart"></i>Add to cart</a>
										</div>
									</div>
								</div>
								<div class="choose">
									<ul class="nav nav-pills nav-justified">
										<li><a href="#"><i class="fa fa-plus-square"></i>Add
												to wishlist</a></li>
										<li><a href="#"><i class="fa fa-plus-square"></i>Add
												to compare</a></li>
									</ul>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
				<!--features_items-->

				<div class="category-tab">
					<!--category-tab-->
					<div class="col-sm-12">
						<ul class="nav nav-tabs">
							<li class="active"><a href="#tshirt" data-toggle="tab">T-Shirt</a></li>
							<li><a href="#blazers" data-toggle="tab">Blazers</a></li>
							<li><a href="#sunglass" data-toggle="tab">Sunglass</a></li>
							<li><a href="#kids" data-toggle="tab">Kids</a></li>
							<li><a href="#poloshirt" data-toggle="tab">Polo shirt</a></li>
						</ul>
					</div>
					<div class="tab-content">
						<div class="tab-pane fade active in" id="tshirt">
							<div class="col-sm-3">
								<div class="product-image-wrapper">
									<div class="single-products">
										<div class="productinfo text-center">
											<img src="images/home/gallery1.jpg" alt="" />
											<h2>$56</h2>
											<p>Easy Polo Black Edition</p>
											<a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-shopping-cart"></i>Add to cart</a>
										</div>

									</div>
								</div>
							</div>
						</div>
						<div class="tab-pane fade" id="blazers">
							<div class="col-sm-3">
								<div class="product-image-wrapper">
									<div class="single-products">
										<div class="productinfo text-center">
											<img src="images/home/gallery4.jpg" alt="" />
											<h2>$56</h2>
											<p>Easy Polo Black Edition</p>
											<a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-shopping-cart"></i>Add to cart</a>
										</div>

									</div>
								</div>
							</div>
						</div>

						<div class="tab-pane fade" id="sunglass">
							<div class="col-sm-3">
								<div class="product-image-wrapper">
									<div class="single-products">
										<div class="productinfo text-center">
											<img src="images/home/gallery3.jpg" alt="" />
											<h2>$56</h2>
											<p>Easy Polo Black Edition</p>
											<a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-shopping-cart"></i>Add to cart</a>
										</div>

									</div>
								</div>
							</div>
						</div>

						<div class="tab-pane fade" id="kids">
							<div class="col-sm-3">
								<div class="product-image-wrapper">
									<div class="single-products">
										<div class="productinfo text-center">
											<img src="images/home/gallery1.jpg" alt="" />
											<h2>$56</h2>
											<p>Easy Polo Black Edition</p>
											<a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-shopping-cart"></i>Add to cart</a>
										</div>

									</div>
								</div>
							</div>
						</div>

						<div class="tab-pane fade" id="poloshirt">
							<div class="col-sm-3">
								<div class="product-image-wrapper">
									<div class="single-products">
										<div class="productinfo text-center">
											<img src="images/home/gallery2.jpg" alt="" />
											<h2>$56</h2>
											<p>Easy Polo Black Edition</p>
											<a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-shopping-cart"></i>Add to cart</a>
										</div>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--/category-tab-->

				<div class="recommended_items">
					<!--recommended_items-->
					<h2 class="title text-center">recommended items</h2>

					<div id="recommended-item-carousel" class="carousel slide"
						data-ride="carousel">
						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-4">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/home/recommend1.jpg" alt="" />
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i
													class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>

										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="col-sm-4">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/home/recommend1.jpg" alt="" />
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i
													class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>

										</div>
									</div>
								</div>
							</div>
						</div>
						<a class="left recommended-item-control"
							href="#recommended-item-carousel" data-slide="prev"> <i
							class="fa fa-angle-left"></i>
						</a> <a class="right recommended-item-control"
							href="#recommended-item-carousel" data-slide="next"> <i
							class="fa fa-angle-right"></i>
						</a>
					</div>
				</div>
				<!--/recommended_items-->

			</div>
		</div>
	</section>

	<!-- footer -->
	<jsp:include page="jsp/fragments/footer.jsp"></jsp:include>
</body>
</html>