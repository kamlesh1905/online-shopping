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
	case 'All Product':
		$('#listProduct').addClass('active');
		break;
	default:
		$('#listProduct').addClass('active');	
	    $('#a_'+menu).addClass('active');
		break;
	}
});