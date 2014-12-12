<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<script src="${baseUrl}/static/system/js/jquery-1.10.1.min.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="${baseUrl}/static/system/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      
<script src="${baseUrl}/static/system/js/bootstrap.min.js" type="text/javascript"></script>
<!--[if lt IE 9]>
<script src="${baseUrl}/static/system/js/excanvas.min.js"></script>
<script src="${baseUrl}/static/system/js/respond.min.js"></script>  
<![endif]-->   
<script src="${baseUrl}/static/system/js/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery.blockui.min.js" type="text/javascript"></script>  
<script src="${baseUrl}/static/system/js/jquery.cookie.min.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery.uniform.min.js" type="text/javascript" ></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="${baseUrl}/static/system/js/jquery.vmap.js" type="text/javascript"></script>   
<script src="${baseUrl}/static/system/js/jquery.vmap.russia.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery.vmap.world.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery.vmap.europe.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery.vmap.germany.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery.vmap.usa.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery.vmap.sampledata.js" type="text/javascript"></script>  
<script src="${baseUrl}/static/system/js/jquery.flot.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery.flot.resize.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery.pulsate.min.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/date.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/daterangepicker.js" type="text/javascript"></script>     
<script src="${baseUrl}/static/system/js/jquery.gritter.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/fullcalendar.min.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery.easy-pie-chart.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/jquery.sparkline.min.js" type="text/javascript"></script>  
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="${baseUrl}/static/system/js/app.js" type="text/javascript"></script>
<script src="${baseUrl}/static/system/js/index.js" type="text/javascript"></script>        
<!-- END PAGE LEVEL SCRIPTS -->  
<script>
	jQuery(document).ready(function() {    
	   App.init(); // initlayout and core plugins
	   Index.init();
	   Index.initJQVMAP(); // init index page's custom scripts
	   Index.initCalendar(); // init index page's custom scripts
	   Index.initCharts(); // init index page's custom scripts
	   Index.initChat();
	   Index.initMiniCharts();
	   Index.initDashboardDaterange();
	   Index.initIntro();
	});
</script>
<!-- END JAVASCRIPTS -->