$(function()
{	
	switch(menu)
	{
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'All Products':
		$('#listProduct').addClass('active');
		break;
	default:
		if(menu=="Home") break;
		$('#listProduct').addClass('active');	
	    $('#a_'+menu).addClass('active');
		break;
	}
});

//Code for jquery dataTable
//Create a dataset


/*var products = [
	
	['1','ABC'],
	['2','PQR'],
	['3','XYZ'],
	['4','CFG'],
	['5','HIK'],
	['6','LMP'],

];*/

   var $table = $('#productListTable');

      //execute the below code only where we have this table

    if($table.length)
	{
	   //console.log('Inside the table');
    	console.log(window.contextRoot);
    	
    	var jsonUrl = '';
		if (window.categoryId == '') 
		{
			
			jsonUrl = window.contextRoot + '/json/data/all/products';
	
		} else {
			
			jsonUrl = window.contextRoot + '/json/data/category/'
					+ window.categoryId + '/products';
		}
    	
	   
	   $table.DataTable(
			   {
				   lengthMenu:[[3,5,10,-1],['3 Records','5 Records','10 Records','ALL']],
				   pageLength:5,
				
				   ajax: {
					   
					   url : jsonUrl,
					         dataSrc: '' 
					         
				         },
				         
				         columns :  [
				        	 
				        	 {
				        		data: 'code',
				        		mRender: function(data,type,row)
				        		{
				        			return '<image src = "'+window.contextRoot+'/resources/images/'+data+'.jpg" class="dataTableImg"/>'
				        		}
				        	 },
				   			        	 
				        	 {
				        		 data:'name'
				        	 },
				        	 {
				        		 data:'brand'
				        	 },	 
				        	 {
				        		 data:'unitPrice',
				        		 mRender: function(data,type,row)
				        		 {
				        			 return '&#8377; ' + data;
				        		 }
				        	 
				        	 },
				        	 {
				        		 data:'quantity',
				        	     mRender : function(data, type, row) 
				        	     {

											if (data < 1) 
											{
												return '<span style="color:red">Out of Stock!</span>';
											}

											return data;						
				        	     
				                }
				        	 },
				        	 {
				        		 data: 'id',
				        		 bSortable : false,
				        		 mRender: function(data,type,row)
				        		 {
				        			 var str = '';
				        			 
				        			 str += '<a href="'+window.contextRoot+ '/show/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';
				        			 
				        			 if(row.quantity < 1)
				        				 {
				        				 str += '<a href="javascript:void(0)" class="btn btn-success disabled"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
				        				 }
				        			 else
				        				 {
				        				 str += '<a href="'+window.contextRoot+ '/cart/add/'+data+'/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
				        				 }
				        			 
				        			 	
				        			 
				        			 return str;
				        		 }
				        	 }
				        	 				        	 
				            ]	
				         
			   });
	   
	   
	}

    //dismissing the alert after 3 seconds
    var $alert = $('.alert');
     if($alert.length)
    {
    	 setTimeout(function(){
    		 $alert.fadeOut('slow');
    	 }, 3000)
    	 
    }
     
    
    

