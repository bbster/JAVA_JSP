<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-12">

				<div class="row products">

					<div class="col-md-3 col-sm-4">
						<div class="product">
							<div class="flip-container">
								<div class="flipper">
									<div class="front">
										<a href="detail.html"> <img src="img/product1.jpg" alt=""
											class="img-responsive">
										</a>
									</div>
									<div class="back">
										<a href="detail.html"> <img src="img/product1_2.jpg"
											alt="" class="img-responsive">
										</a>
									</div>
								</div>
							</div>
							<a href="detail.html" class="invisible"> <img
								src="img/product1.jpg" alt="" class="img-responsive">
							</a>
							<div class="text">
								<h3>
									<a href="./product?sign=pDetail&pno=${pdto.pno }">Fur coat with very but very very long
										name</a>
								</h3>
								<p class="price">$143.00</p>
								<p class="buttons">
									<a href="detail.html" class="btn btn-default">View detail</a> <a
										href="basket.html" class="btn btn-primary"><i
										class="fa fa-shopping-cart"></i>Add to cart</a>
								</p>
							</div>
							<!-- /.text -->
						</div>
						<!-- /.product -->
					</div>

				</div>
			</div>
		</div>
	</div>
</div>
