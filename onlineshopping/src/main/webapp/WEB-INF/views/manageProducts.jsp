<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="container">

	<div class="row">
	
<c:if test="${not empty message}">
	
	<div class="col-xs-12">
	
		<div class="alert alert-success alert-dismissible">
			
			<button type="button" class="close" data-dismiss="alert">&times;</button>
			
			${message}
		
		</div>
	
	</div>
	
</c:if>

		<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading">
					<h4>Product Management</h4>
				</div>

				<div class="panel-body">

					<!-- FORM ELEMENTS -->

					<sf:form class="form-horizontal" modelAttribute="product"
					action="${contextRoot}/manage/products" method="POST">

						<div class="form-group">

							<label class="control-label col-md-4" for="name">Enter
								Product Name : </label>

							<div class="col-md-8">
								<sf:input type="text" path="name" class="form-control"
									placeholder="Product Name" />

								<em class="help-block">Please Enter Product Name !</em>

							</div>
						</div>

						<div class="form-group">

							<label class="control-label col-md-4" for="brand">Enter
								Product Brand : </label>

							<div class="col-md-8">

								<sf:input type="text" path="brand" id="brand"
									placeholder="Product Brand" class="form-control" />
								<em class="help-block">Please Enter Brand Name !</em>

							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Description</label>
								<div class="col-md-8">
									<sf:textarea path="description" class="form-control"
										placeholder="Enter your description here!" />
									<sf:errors path="description" cssClass="help-block"
										element="em" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Unit Price</label>
								<div class="col-md-8">
									<sf:input type="number" path="unitPrice" class="form-control"
										placeholder="Enter Unit Price" />
									<sf:errors path="unitPrice" cssClass="help-block" element="em" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Quantity</label>
								<div class="col-md-8">
									<sf:input type="number" path="quantity" class="form-control"
										placeholder="Enter Quantity" />
									<sf:errors path="quantity" cssClass="help-block" element="em" />
								</div>
							</div>
							
							<div class="form-group">
								<label class="control-label col-md-4" for="categoryId">Select Category:</label>
								<div class="col-md-8">
								
								<sf:select path="categoryId" items="${categories}" itemLabel="name" itemValue="id" class="form-control"/>
								
									
								</div>
							</div>
						</div>
							

							<div class="form-group">

							<div class="col-md-offset-4 col-md-4">

								<input type="submit" name="submit" id="submit" value="submit"
									class="btn btn-primary">
									
									<sf:hidden path="id"/>
									<sf:hidden path="code"/>
									<sf:hidden path="supplierId"/>
									<sf:hidden path="active"/>
									<sf:hidden path="purchases"/>
									<sf:hidden path="views"/>														

							</div>

						</div>
						
					</sf:form>
					
				</div>
			</div>
		</div>
	</div>
</div>