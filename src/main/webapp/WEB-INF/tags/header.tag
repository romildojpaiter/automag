<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@attribute name="title" type="java.lang.String" %>
<%@attribute name="description" type="java.lang.String" %>
<%@attribute name="facebookMetas" type="java.lang.Boolean"%>

<!DOCTYPE html>
<!--[if lt IE 7]><html class="no-js ie6 lt-ie7"> <![endif]-->
<!--[if IE 7]> <html class="no-js ie7 lt-ie8 lt-ie9"> <![endif]-->
<!--[if IE 8]> <html class="no-js ie8 lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
	<meta charset="utf-8">
	<title><fmt:message key="portal.title"/></title>
	<meta name="description" content="Autonet Magazine">

	<link rel="stylesheet" href="css/autonetmag.css">
	<link rel="stylesheet" href="css/main.css">
	<link rel="stylesheet" href="css/uniform.default.css">
	<link rel="stylesheet" href="css/prettyPhoto.css">
	
	<script src="js/vendor/modernizr-2.6.2.min.js"></script>
	<script src="js/vendor/jquery-1.8.2.min.js"></script>
	<script src="js/vendor/selectivizr.js"></script>
	<script src="js/vendor/PIE.js"></script>
	<script src="js/plugins/jquery.placeholder.min.js"></script>
	<script src="js/plugins/jquery.uniform.min.js"></script>
	<script src="js/plugins/jquery.flexslider-min.js"></script>
	<script src="js/plugins/jquery.carouFredSel-6.1.0-packed.js"></script>
	<script src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>
	<script src="js/plugins/jquery.prettyPhoto.js"></script>
	<script src="js/plugins/jquery.countdown.js"></script>
	
	<script src="js/plugins.js"></script>
	<script src="js/main.js"></script>

<%--
    <!-- 
	**********************************************************
	In development, use the LESS files and the less.js compiler
	instead of the minified CSS loaded by default.
	**********************************************************
	<link rel="stylesheet/less" href="assets/less/admin/module.admin.stylesheet-complete.sidebar_type.collapse.less" />
	-->
    <!--[if lt IE 9]><link rel="stylesheet" href="assets/components/library/bootstrap/css/bootstrap.min.css" /><![endif]-->
    <link rel="stylesheet" href="assets/css/admin/module.admin.stylesheet-complete.sidebar_type.collapse.min.css" />

	<link rel="stylesheet/less" href="assets/less/front/module.front.stylesheet-complete.less" />
     --%>
	
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <script src="assets/components/plugins/ajaxify/script.min.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
    <script>
    var App = {};
    </script>
    <script data-id="App.Scripts">
    App.Scripts = {
        /* CORE scripts always load first; */
        core: [
            'assets/components/library/jquery/jquery.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            'assets/components/library/modernizr/modernizr.js?v=v1.0.3-rc2&sv=v0.0.1.1'
        ],
        /* PLUGINS_DEPENDENCY always load after CORE but before PLUGINS; */
        plugins_dependency: [
            'assets/components/library/bootstrap/js/bootstrap.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            'assets/components/library/jquery/jquery-migrate.min.js?v=v1.0.3-rc2&sv=v0.0.1.1'
        ],
        /* PLUGINS always load after CORE and PLUGINS_DEPENDENCY, but before the BUNDLE / initialization scripts; */
        plugins: [
            'assets/components/plugins/nicescroll/jquery.nicescroll.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            'assets/components/plugins/breakpoints/breakpoints.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            'assets/components/plugins/ajaxify/davis.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            'assets/components/plugins/ajaxify/jquery.lazyjaxdavis.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            'assets/components/plugins/preload/pace/pace.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            'assets/components/common/forms/validator/assets/lib/jquery-validation/dist/jquery.validate.min.js?v=v1.0.3-rc2',
            'assets/components/common/forms/elements/bootstrap-select/assets/lib/js/bootstrap-select.js?v=v1.0.3-rc2',
            'assets/components/plugins/less-js/less.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            'assets/components/modules/admin/charts/flot/assets/lib/excanvas.js?v=v1.0.3-rc2',
            'assets/components/plugins/browser/ie/ie.prototype.polyfill.js?v=v1.0.3-rc2&sv=v0.0.1.1'
        ],
        /* The initialization scripts always load last and are automatically and dynamically loaded when AJAX navigation is enabled; */
        bundle: [
            'assets/components/plugins/ajaxify/ajaxify.init.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            'assets/components/plugins/preload/pace/preload.pace.init.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            'assets/components/core/js/animations.init.js?v=v1.0.3-rc2',
            'assets/components/common/forms/validator/assets/custom/form-validator.init.js?v=v1.0.3-rc2',
            'assets/components/common/forms/elements/fuelux-checkbox/fuelux-checkbox.init.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            'assets/components/core/js/sidebar.main.init.js?v=v1.0.3-rc2',
            'assets/components/core/js/sidebar.collapse.init.js?v=v1.0.3-rc2',
            'assets/components/common/forms/elements/bootstrap-select/assets/custom/js/bootstrap-select.init.js?v=v1.0.3-rc2',
            'assets/components/core/js/core.init.js?v=v1.0.3-rc2'
        ]
    };
    </script>
    <script>
    $script(App.Scripts.core, 'core');
    $script.ready(['core'], function()
    {
        $script(App.Scripts.plugins_dependency, 'plugins_dependency');
    });
    $script.ready(['core', 'plugins_dependency'], function()
    {
        $script(App.Scripts.plugins, 'plugins');
    });
    $script.ready(['core', 'plugins_dependency', 'plugins'], function()
    {
        $script(App.Scripts.bundle, 'bundle');
    });
    </script>
    <script>
    if ( /*@cc_on!@*/ false && document.documentMode === 10)
    {
        document.documentElement.className += ' ie ie10';
    }
    </script>	
	
</head>
<body>

<!--[if lt IE 7]>
<p class="chromeframe">Você esta utilizando um navegador <strong>desatualizado</strong>. Por favor <a href="http://browsehappy.com/">atualize seu navegadir</a> or <a href="http://www.google.com/chromeframe/?redirect=true">ative Google Chrome</a> para melhorar sua experiência.</p>
<![endif]-->

<header>
	<tags:automag-header />

</header>