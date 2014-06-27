<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<!--[if lt IE 7]> <html class="ie lt-ie9 lt-ie8 lt-ie7 sidebar sidebar-collapse"> <![endif]-->
<!--[if IE 7]>    <html class="ie lt-ie9 lt-ie8 sidebar sidebar-collapse"> <![endif]-->
<!--[if IE 8]>    <html class="ie lt-ie9 sidebar sidebar-collapse"> <![endif]-->
<!--[if gt IE 8]> <html class="ie sidebar sidebar-collapse"> <![endif]-->
<!--[if !IE]><!-->
<html class="sidebar sidebar-collapse">
<!-- <![endif]-->
<head>
    <title>BUSINESS Template (v1.0.3-rc2)</title>
    <!-- Meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <!-- 
	**********************************************************
	In development, use the LESS files and the less.js compiler
	instead of the minified CSS loaded by default.
	**********************************************************
	<link rel="stylesheet/less" href="../assets/less/admin/module.admin.stylesheet-complete.sidebar_type.collapse.less" />
	-->
    <!--[if lt IE 9]><link rel="stylesheet" href="../assets/components/library/bootstrap/css/bootstrap.min.css" /><![endif]-->
    <link rel="stylesheet" href="../assets/css/admin/module.admin.stylesheet-complete.sidebar_type.collapse.min.css"
    />
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <script src="../assets/components/plugins/ajaxify/script.min.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
    <script>
    var App = {};
    </script>
    <script data-id="App.Scripts">
    App.Scripts = {
        /* CORE scripts always load first; */
        core: [
            '../assets/components/library/jquery/jquery.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/library/modernizr/modernizr.js?v=v1.0.3-rc2&sv=v0.0.1.1'
        ],
        /* PLUGINS_DEPENDENCY always load after CORE but before PLUGINS; */
        plugins_dependency: [
            '../assets/components/library/bootstrap/js/bootstrap.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/library/jquery/jquery-migrate.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/modules/admin/maps/vector/assets/lib/jquery-jvectormap-1.2.2.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/modules/admin/charts/flot/assets/lib/jquery.flot.js?v=v1.0.3-rc2'
        ],
        /* PLUGINS always load after CORE and PLUGINS_DEPENDENCY, but before the BUNDLE / initialization scripts; */
        plugins: [
            '../assets/components/plugins/nicescroll/jquery.nicescroll.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/plugins/breakpoints/breakpoints.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/plugins/ajaxify/davis.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/plugins/ajaxify/jquery.lazyjaxdavis.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/plugins/preload/pace/pace.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/modules/admin/charts/flot/assets/lib/jquery.flot.resize.js?v=v1.0.3-rc2',
            '../assets/components/modules/admin/charts/flot/assets/lib/plugins/jquery.flot.tooltip.min.js?v=v1.0.3-rc2',
            '../assets/components/modules/admin/charts/flot/assets/custom/js/flotcharts.common.js?v=v1.0.3-rc2',
            '../assets/components/modules/admin/charts/easy-pie/assets/lib/js/jquery.easy-pie-chart.js?v=v1.0.3-rc2',
            '../assets/components/modules/admin/charts/sparkline/jquery.sparkline.min.js?v=v1.0.3-rc2',
            '../assets/components/modules/admin/maps/vector/assets/lib/maps/jquery-jvectormap-world-mill-en.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/common/forms/elements/bootstrap-select/assets/lib/js/bootstrap-select.js?v=v1.0.3-rc2',
            '../assets/components/plugins/less-js/less.min.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/modules/admin/charts/flot/assets/lib/excanvas.js?v=v1.0.3-rc2',
            '../assets/components/plugins/browser/ie/ie.prototype.polyfill.js?v=v1.0.3-rc2&sv=v0.0.1.1'
        ],
        /* The initialization scripts always load last and are automatically and dynamically loaded when AJAX navigation is enabled; */
        bundle: [
            '../assets/components/plugins/ajaxify/ajaxify.init.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/plugins/preload/pace/preload.pace.init.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/core/js/animations.init.js?v=v1.0.3-rc2',
            '../assets/components/modules/admin/charts/flot/assets/custom/js/flotchart-line-2.init.js?v=v1.0.3-rc2',
            '../assets/components/modules/admin/charts/flot/assets/custom/js/flotchart-mixed-1.init.js?v=v1.0.3-rc2',
            '../assets/components/modules/admin/charts/flot/assets/custom/js/flotchart-bars-horizontal.init.js?v=v1.0.3-rc2',
            '../assets/components/modules/admin/charts/easy-pie/assets/custom/easy-pie.init.js?v=v1.0.3-rc2',
            '../assets/components/modules/admin/charts/sparkline/sparkline.init.js?v=v1.0.3-rc2',
            '../assets/components/modules/admin/maps/vector/assets/custom/maps-vector.world-map-markers.init.js?v=v1.0.3-rc2&sv=v0.0.1.1',
            '../assets/components/core/js/sidebar.main.init.js?v=v1.0.3-rc2',
            '../assets/components/core/js/sidebar.collapse.init.js?v=v1.0.3-rc2',
            '../assets/components/common/forms/elements/bootstrap-select/assets/custom/js/bootstrap-select.init.js?v=v1.0.3-rc2',
            '../assets/components/core/js/core.init.js?v=v1.0.3-rc2'
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


<body class="scripts-async">

    <!-- Main Container Fluid -->
    <div class="container-fluid menu-hidden">
        <!-- Sidebar Menu -->
        <div id="menu" class="hidden-print hidden-xs  sidebar-white">
            <div id="sidebar-collapse-wrapper">
                <div id="brandWrapper">
                    <a href="index.html?lang=en" class="display-block-inline pull-left logo">
                        <img src="../assets/images/logo/logo.jpg" alt="">
                    </a>
                    <a href="index.html?lang=en">
                        <span class="text">mosaicpro</span>
                    </a>
                </div>
                <div id="logoWrapper">
                    <div id="logo">
                        <a href="index.html?lang=en" class="btn btn-sm btn-inverse"><i class="fa fa-fw icon-home-fill-1"></i></a>
                        <a href="email.html?lang=en" class="btn btn-sm btn-inverse"><i class="fa fa-fw fa-envelope"></i><span class="badge pull-right badge-primary">2</span></a>
                        <a href="email.html?lang=en" class="btn btn-sm btn-inverse"><i class="fa fa-fw fa-lock"></i><span class="badge pull-right badge-primary">7</span></a>
                        <a href="email.html?lang=en" class="btn btn-sm btn-inverse pull-right"><i class="fa fa-fw fa-sign-out"></i></a>
                    </div>
                </div>
                <ul class="menu list-unstyled hide" id="navigation_components">
                </ul>
                <ul class="menu list-unstyled hide" id="navigation_modules">
                </ul>
                <ul class="menu list-unstyled hide" id="navigation_modules_front">
                </ul>
                <ul class="menu list-unstyled" id="navigation_current_page">
                    <li class="hasSubmenu  active">
                        <a href="#sidebar-collapse-overview" data-toggle="collapse" class="glyphicons home ">
                            <span class="badge pull-right badge-primary hidden-md">2</span><i></i>
                            <span>Overview</span>
                        </a>
                        <ul id="sidebar-collapse-overview" class="collapse   in ">
                            <li class="active"><a href="index.html?lang=en"><i class="fa fa-rss"></i> Analytics</a>
                            </li>
                            <li><a href="dashboard_users.html?lang=en"><i class="fa fa-group"></i> Users</a>
                            </li>
                            <!-- <li><a href="medical_overview.html?lang=en"><i class="fa fa-medkit"></i> Medical</a></li> -->
                            <!-- <li><a href="finances.html?lang=en"><i class="fa fa-credit-card"></i>Financial</a></li> -->
                            <!-- <li><a href="courses_2.html?lang=en"><i class="fa fa-book"></i>Learning</a></li> -->
                        </ul>
                    </li>
                    <li class="hasSubmenu ">
                        <a href="#sidebar-collapse-media" data-toggle="collapse" class="glyphicons picture ">
                            <span class="badge pull-right badge-primary hidden-md">2</span><i></i>
                            <span>Cadastos</span>
                        </a>
                        <ul id="sidebar-collapse-media" class="collapse  ">
                            <li><a href="gallery_video.html?lang=en"><i class="fa fa-video-camera"></i> Clientes</a>
                            </li>
                            <li>
                            	<a href="gallery.html?lang=en"><i class="fa fa-camera"></i> Categoria</a>
                            </li>
                            <li>
                            	<a href="gallery.html?lang=en"><i class="fa fa-camera"></i> Modelos</a>
                            </li>
                            <li>
                            	<a href="gallery.html?lang=en"><i class="fa fa-camera"></i> Marcas</a>
                            </li>
                            <li>
                            	<a href="gallery.html?lang=en"><i class="fa fa-camera"></i> Cor</a>
                            </li>
                            <li>
                            	<a href="gallery.html?lang=en"><i class="fa fa-camera"></i> Serviços</a>
                            </li>
                        </ul>
                    </li>
               </ul>
            </div>
        </div>
        <!-- // Sidebar Menu END -->
        
        <!-- Content -->
        <div id="content">
            <nav class="navbar hidden-print main " role="navigation">
                <div class="navbar-header pull-left">
                    <div class="user-action user-action-btn-navbar pull-left border-right">
                        <button class="btn btn-sm btn-navbar btn-inverse btn-stroke"><i class="fa fa-bars fa-2x"></i>
                        </button>
                    </div>
                </div>
                <ul class="main pull-right ">
                    <li class="dropdown notif notifications hidden-xs">
                        <a href="" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-bell-fill"></i> <span class="label label-danger">5</span></a>
                        <ul class="dropdown-menu chat media-list pull-right">
                            <li class="media">
                                <a class="pull-left" href="#">
                                    <img class="media-object thumb" src="../assets/images/people/100/15.jpg"
                                    alt="50x50" width="50" />
                                </a>
                                <div class="media-body">
                                    <span class="label label-default pull-right">5 min</span>
                                    <h5 class="media-heading">Adrian D.</h5>
                                    <p class="margin-none">Lorem ipsum dolor sit amet, consectetur adipisicing
                                        elit.</p>
                                </div>
                            </li>
                            <li class="media">
                                <a class="pull-left" href="#">
                                    <img class="media-object thumb" src="../assets/images/people/100/16.jpg"
                                    alt="50x50" width="50" />
                                </a>
                                <div class="media-body">
                                    <span class="label label-default pull-right">2 days</span>
                                    <h5 class="media-heading">Jane B.</h5>
                                    <p class="margin-none">Lorem ipsum dolor sit amet, consectetur adipisicing
                                        elit.</p>
                                </div>
                            </li>
                            <li class="media">
                                <a class="pull-left" href="#">
                                    <img class="media-object thumb" src="../assets/images/people/100/17.jpg"
                                    alt="50x50" width="50" />
                                </a>
                                <div class="media-body">
                                    <span class="label label-default pull-right">3 days</span>
                                    <h5 class="media-heading">Andrew M.</h5>
                                    <p class="margin-none">Lorem ipsum dolor sit amet, consectetur adipisicing
                                        elit.</p>
                                </div>
                            </li>
                            <li><a href="#" class="btn btn-primary"><i class="fa fa-list"></i> <span>View all messages</span></a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown username">
                        <a href="" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="../assets/images/people/35/2.jpg" class="img-circle"
                            width="30" />Bill Jonson
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu pull-right">
                            <li><a href="my_account.html?lang=en" class="glyphicons user"><i></i> Account</a>
                            </li>
                            <li><a href="messages.html?lang=en" class="glyphicons envelope"><i></i>Messages</a>
                            </li>
                            <li><a href="index.html?lang=en" class="glyphicons settings"><i></i>Settings</a>
                            </li>
                            <li><a href="login.html?lang=en" class="glyphicons lock no-ajaxify"><i></i>Logout</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                
            </nav>
            <!-- // END navbar -->
            
            <div class="innerLR">
                <h2 class="margin-none">Analytics &nbsp;<i class="fa fa-fw fa-pencil text-muted"></i>
                </h2>
                <div class="row">
                    <div class="col-md-8">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="widget innerAll text-center">
                                    <h3 class="innerT">Overall Performance</h3>
                                    <p class="innerB margin-none text-xlarge text-condensed strong text-primary">+281</p>
                                    <div class="innerTB">
                                        <div class="sparkline" sparkHeight="57">0:10,7:3,5:5,6:4,3:7,7:3,5:5,6:4,2:8,3:7,7:3,5:5,0:10</div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="widget widget-tabs widget-tabs-double-2 border-bottom widget-tabs-responsive">
                                    <div class="widget-body">
                                        <div class="tab-content">
                                            <!-- Tab content -->
                                            <div id="tabReports" class="tab-pane active widget-body-regular innerAll inner-2x text-center">
                                                <div data-percent="85" data-size="95" class="easy-pie inline-block primary" data-scale-color="false"
                                                data-track-color="#efefef" data-line-width="8">
                                                    <div class="value text-center">
                                                        <span class="strong"><i class="icon-graph-up-1 fa-3x text-primary"></i>
                                                        </span>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- // Tab content END -->
                                            <!-- Tab content -->
                                            <div id="tabIncome" class="tab-pane widget-body-regular innerAll inner-2x text-center">
                                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reprehenderit, omnis
                                                minus voluptatibus assumenda sint
                                                autem dolorum. Rem, cupiditate,
                                                sed, optio est cumque repudiandae
                                                quo natus dignissimos praesentium
                                                alias nihil aspernatur?
                                            </div>
                                            <!-- // Tab content END -->
                                            <!-- Tab content -->
                                            <div id="tabAccounts" class="tab-pane widget-body-regular innerAll inner-2x text-center">
                                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Hic qui natus deserunt
                                                atque quae laborum. Porro, eveniet,
                                                voluptatem, obcaecati quisquam
                                                tempore architecto nostrum quis
                                                eius corrupti ea non facilis quidem.
                                            </div>
                                            <!-- // Tab content END -->
                                        </div>
                                    </div>
                                    <!-- Tabs Heading -->
                                    <div class="widget-head border-top-none bg-gray">
                                        <ul>
                                            <li class="active"><a class="glyphicons notes" href="#tabReports"
                                                data-toggle="tab"><i></i><span>Reports</span></a>
                                            </li>
                                            <li><a class="glyphicons credit_card" href="#tabIncome"
                                                data-toggle="tab"><i></i><span>Income</span></a>
                                            </li>
                                            <li><a class="glyphicons user" href="#tabAccounts"
                                                data-toggle="tab"><i></i><span>Accounts</span></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <!-- // Tabs Heading END -->
                                </div>
                                <!-- //Widget -->
                            </div>
                            <!-- //Col -->
                        </div>
                        <!-- //Row -->
                        <!-- Widget -->
                        <div class=" widget widget-body-white ">
                            <div class="widget-head height-auto ">
                                <div class="row row-merge ">
                                    <div class="col-md-6">
                                        <div class="innerAll inner-2x text-center">
                                            <h5 class="margin-none innerB half">Gross Revenue</h5>
                                            <h4 class="text-medium strong text-primary margin-none">10,201.00</h4>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="innerAll inner-2x text-center">
                                            <h5 class="margin-none innerB half">Net Revenue</h5>
                                            <h4 class="text-medium text-primary strong margin-none">8,812.40</h4>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="widget-body innerAll">
                                <!-- Chart with lines and fill with no points -->
                                <div id="chart_lines_fill_nopoints_2" class="flotchart-holder"></div>
                            </div>
                        </div>
                        <!-- //Widget -->
                        <div class="row">
                            <div class="col-md-6">
                                <!-- Widget -->
                                <div class="widget">
                                    <div class="bg-primary text-center innerAll">
                                        <div class="innerTB">
                                            <h4 class="innerTB text-white">Today's Weather</h4>
                                            <div class="strong text-xlarge text-white">
                                                <i class="fa fa-cloud"></i> 26<sup>&deg;</sup>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row row-merge">
                                        <div class="col-md-6">
                                            <div class="text-center innerAll">
                                                <p class="margin-none"><i class="fa icon-wind-speed-censor fa-2x"></i>
                                                </p>
                                                <p class="lead margin-none strong">15 m/h</p>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="text-center innerAll">
                                                <p class="margin-none"><i class="fa icon-water fa-2x"></i>
                                                </p>
                                                <p class="lead margin-none strong">40%</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- //Widget -->
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="widget">
                                    <div class="widget-body innerB half">
                                        <!-- Chart with lines and fill with no points -->
                                        <div id="chart_mixed_1" class="flotchart-holder" style="height: 182px"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- //Row -->
                        <!-- Widget	 -->
                        <div class="widget">
                            <div class="widget-head innerAll half">
                                <h4 class="margin-none"><i class="fa fa-fw icon-star"></i> Trends</h4>
                            </div>
                            <!-- Widget -->
                            <div class="widget-body innerAll inner-2x">
                                <table class="table table-striped margin-none">
                                    <thead>
                                        <tr>
                                            <th>Box office</th>
                                            <th class="text-center">Cash</th>
                                            <th class="text-right" style="width: 100px;">Trend</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>
                                                <strong>1.</strong>Frozen</td>
                                            <td class="text-center">&euro;8,718,939</td>
                                            <td class="text-right">
                                                <div class="sparkline" style="width: 100px;" sparkHeight="20" sparkType="line"
                                                sparkWidth="100%" sparkLineWidth="2"
                                                sparkLineColor="#3695d5" sparkFillColor=""
                                                data-data="[222,337,276,281,264,370,364,402,463,427]">
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <strong>2.</strong>The Hobbit 2</td>
                                            <td class="text-center">&euro;7,800,000</td>
                                            <td class="text-right">
                                                <div class="sparkline" style="width: 100px;" sparkHeight="20" sparkType="line"
                                                sparkWidth="100%" sparkLineWidth="2"
                                                sparkLineColor="#3695d5" sparkFillColor=""
                                                data-data="[238,350,210,106,204,378,279,125,410,370]">
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <strong>3.</strong>The Wolf of Wall Street</td>
                                            <td class="text-center">&euro;5,671,036</td>
                                            <td class="text-right">
                                                <div class="sparkline" style="width: 100px;" sparkHeight="20" sparkType="line"
                                                sparkWidth="100%" sparkLineWidth="2"
                                                sparkLineColor="#3695d5" sparkFillColor=""
                                                data-data="[419,148,421,159,264,410,240,382,463,183]">
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <strong>4.</strong>Iron Man 3</td>
                                            <td class="text-center">&euro;409,013,994</td>
                                            <td class="text-right">
                                                <div class="sparkline" style="width: 100px;" sparkHeight="20" sparkType="line"
                                                sparkWidth="100%" sparkLineWidth="2"
                                                sparkLineColor="#3695d5" sparkFillColor=""
                                                data-data="[308,238,292,129,289,463,310,428,236,217]">
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <strong>5.</strong>Catching Fire</td>
                                            <td class="text-center">&euro;398,327,026</td>
                                            <td class="text-right">
                                                <div class="sparkline" style="width: 100px;" sparkHeight="20" sparkType="line"
                                                sparkWidth="100%" sparkLineWidth="2"
                                                sparkLineColor="#3695d5" sparkFillColor=""
                                                data-data="[259,454,159,429,468,477,176,146,300,416]">
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <strong>6.</strong>Despicable Me 2</td>
                                            <td class="text-center">&euro;367,835,345</td>
                                            <td class="text-right">
                                                <div class="sparkline" style="width: 100px;" sparkHeight="20" sparkType="line"
                                                sparkWidth="100%" sparkLineWidth="2"
                                                sparkLineColor="#3695d5" sparkFillColor=""
                                                data-data="[124,354,127,398,473,355,259,364,127,271]">
                                                </div>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            <!-- // End Widget Body -->
                        </div>
                        <!-- // End Widget -->
                        <!-- Widget	 -->
                        <div class="widget widget-body-white overflow-hidden">
                            <div class="widget-head innerAll half">
                                <h4 class="margin-none"><i class="fa fa-fw icon-wallet"></i> Sales Volume</h4>
                            </div>
                            <div class="widget-body innerAll">
                                <!-- Horizontal Bars Chart -->
                                <div id="chart_horizontal_bars" class="flotchart-holder"></div>
                            </div>
                        </div>
                        <!-- //Widget -->
                    </div>
                    <!-- //  End Col -->
                    <div class="col-md-4">
                        <!-- Widget -->
                        <div class="widget widget-body-gray">
                            <div class="widget-body padding-none">
                                <div class="bg-primary innerAll">
                                    <div class="text-large text-white pull-right">&euro;1000</div>
                                    <h4 class="text-white strong text-medium">Earnings</h4>
                                    <h5 class="text-white margin-none">Today's earnings</h5>
                                    <div class="separator bottom"></div>
                                    <div class="progress primary progress-mini  margin-none">
                                        <div class="progress-bar progress-bar-white	" style="width: 70%;"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- //End Widget -->
                        <!-- Widget -->
                        <div class="widget widget-body-gray">
                            <div class="innerAll half border-bottom">
                                <div class="btn-group btn-group-sm pull-right">
                                    <button data-toggle="dropdown" class="btn btn-primary dropdown-toggle">Monthly
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li class="active"><a href="">Monthly</a>
                                        </li>
                                        <li><a href="">Quarterly</a>
                                        </li>
                                        <li><a href="">Yearly</a>
                                        </li>
                                    </ul>
                                </div>
                                <h4 class="innerT half margin-none pull-left">Monthly Spend</h4>
                                <div class="clearfix"></div>
                            </div>
                            <div class="widget-body">
                                <p class="margin-none">Lorem ipsum dolor sit amet, consectetur adipisicing
                                    elit. Quod, ipsam, minus nam consequatur aliquid
                                    sint.</p>
                            </div>
                            <div class="innerAll ">
                                <p class="text-large">&euro;3,204.89</p>
                                <div class="progress">
                                    <div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="40"
                                    aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                        <span class="sr-only">40% from last month</span>
                                    </div>
                                </div>
                                <div class="text-right">
                                    <p class="strong margin-none">&euro;5,127.82</p>
                                    <p>
                                        <em>Previus month bill</em>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <!-- //End Widget -->
                        <!-- Widget	 -->
                        <div class="widget">
                            <div class="widget-head">
                                <h4 class="innerAll half"><i class="fa fa-fw icon-worldwide"></i> Demographic</h4>
                            </div>
                            <div class="bg-white border-bottom text-center">
                                <div id="world-map-markers" style="height: 200px"></div>
                            </div>
                            <ul class="list-unstyled">
                                <li class="innerAll border-bottom">
                                    <div class="pull-right strong">1249</div><i class="fa fa-fw fa-circle text-info"></i> Miami</li>
                                <li class="innerAll border-bottom">
                                    <div class="pull-right strong">892</div><i class="fa fa-fw fa-circle text-success"></i> Chicago</li>
                                <li class="innerAll border-bottom">
                                    <div class="pull-right strong">530</div><i class="fa fa-fw fa-circle text-primary"></i> Michigan</li>
                                <li class="innerAll">
                                    <div class="pull-right strong">380</div><i class="fa fa-fw fa-circle"></i> Boston</li>
                            </ul>
                        </div>
                        <!-- //Widget -->
                        <!-- Widget -->
                        <div class="widget">
                            <div class="row row-merge">
                                <div class="col-md-4 bg-gray">
                                    <div class="innerAll inner-2x text-center">
                                        <div class="sparkline" sparkHeight="74" data-colors="#cacaca, #4a8bc2,#609450,#cacaca">1,4,3,8</div>
                                    </div>
                                </div>
                                <div class="col-md-8">
                                    <div class="innerAll">
                                        <ul class="list-unstyled">
                                            <li class="innerAll half"><i class="fa fa-fw fa-square text-info"></i> 
                                                <span
                                                class="strong">5,931</span>Visits</li>
                                            <li class="innerAll half"><i class="fa fa-fw fa-square text-success"></i> 
                                                <span
                                                class="strong">402</span>Conversions</li>
                                            <li class="innerAll half"><i class="fa fa-fw fa-square text-muted"></i> 
                                                <span
                                                class="strong">15,120</span>Pageviews</li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- //End Widget -->
                        <!-- Widget -->
                        <div class="widget widget-body-gray">
                            <div class=" innerAll half border-bottom">
                                <div class="btn-group btn-group-sm pull-right">
                                    <button class="btn btn-primary dropdown-toggle" data-toggle="dropdown">Day
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="#">Day</a>
                                        </li>
                                        <li><a href="#">Week</a>
                                        </li>
                                        <li><a href="#">Month</a>
                                        </li>
                                    </ul>
                                </div>
                                <h4 class="pull-left innerT half margin-none"><i class="fa fa-fw fa-money"></i> Earnings</h4>
                                <div class="clearfix"></div>
                            </div>
                            <div class="innerAll border-bottom">
                                <p class="margin-none">
                                    <span class="strong">Today:</span>&euro;502.42 <i class="fa text-primary fa-fw fa-arrow-up"></i>
                                    <span
                                    class="strong text-primary">4%</span>
                                </p>
                            </div>
                            <div class="widget-body ">
                                <div class="sparkline" sparkType="line" sparkResize="true" sparkHeight="76" sparkLineWidth="2"
                                sparkWidth="100%" sparkLineColor="#3695d5" sparkSpotColor="#3695d5"
                                sparkFillColor="" sparkHighlightLineColor="#7c7c7c"
                                sparkHighlightSpotColor="#7c7c7c" sparkSpotRadius="4"
                                sparkMinSpotColor="#b55151" sparkMaxSpotColor="#609450">
                                    195,169,237,342,271,326,150,222,320,297</div>
                            </div>
                        </div>
                        <!-- //End Widget -->
                    </div>
                    <!-- //End Col -->
                </div>
            </div>
        </div>
        <!-- // Content END -->

        <div class="clearfix"></div>
        <!-- // Sidebar menu & content wrapper END -->
        <div id="footer" class="hidden-print">
            <!--  Copyright Line -->
            <div class="copy">&copy; 2012 - 2014 - <a href="http://www.mosaicpro.biz">MosaicPro</a> -
                All Rights Reserved. <a href="http://themeforest.net/?ref=mosaicpro"
                target="_blank">Purchase BUSINESS on ThemeForest</a> - Current version:
                v1.0.3-rc2 / <a target="_blank" href="../assets/../../CHANGELOG.txt?v=v1.0.3-rc2">changelog</a>
            </div>
            <!--  End Copyright Line -->
        </div>
        <!-- // Footer END -->
    </div>
    
    
    <!-- // Main Container Fluid END -->
    <!-- Global -->
    <script data-id="App.Config">
    var basePath = '',
        commonPath = '../assets/',
        rootPath = '',
        DEV = false,
        componentsPath = '../assets/components/';
    var primaryColor = '#3695d5',
        dangerColor = '#b55151',
        successColor = '#609450',
        infoColor = '#4a8bc2',
        warningColor = '#ab7a4b',
        inverseColor = '#45484d';
    var themerPrimaryColor = primaryColor;
    App.Config = {
        ajaxify_menu_selectors: ['#menu'],
        ajaxify_layout_app: false
    };
    </script>
</body>
</html>