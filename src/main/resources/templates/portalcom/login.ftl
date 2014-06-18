<!DOCTYPE html>
<!--[if lt IE 7]> <html class="ie lt-ie9 lt-ie8 lt-ie7 "> <![endif]-->
<!--[if IE 7]>    <html class="ie lt-ie9 lt-ie8 "> <![endif]-->
<!--[if IE 8]>    <html class="ie lt-ie9 "> <![endif]-->
<!--[if gt IE 8]> <html class="ie "> <![endif]-->
<!--[if !IE]><!-->
<html class="">
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
	<link rel="stylesheet/less" href="../assets/less/admin/module.admin.stylesheet-complete.sidebar_type.discover.less" />
	-->
    <!--[if lt IE 9]><link rel="stylesheet" href="../assets/components/library/bootstrap/css/bootstrap.min.css" /><![endif]-->
    <link rel="stylesheet" href="../assets/css/admin/module.admin.stylesheet-complete.sidebar_type.discover.min.css"
    />
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <script src="../assets/components/library/jquery/jquery.min.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
    <script src="../assets/components/library/jquery/jquery-migrate.min.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
    <script src="../assets/components/library/modernizr/modernizr.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
    <script src="../assets/components/plugins/less-js/less.min.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
    <script src="../assets/components/modules/admin/charts/flot/assets/lib/excanvas.js?v=v1.0.3-rc2"></script>
    <script src="../assets/components/plugins/browser/ie/ie.prototype.polyfill.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
    <script>
    if ( /*@cc_on!@*/ false && document.documentMode === 10)
    {
        document.documentElement.className += ' ie ie10';
    }
    </script>
</head>
<body class=" loginWrapper">
    <!-- Main Container Fluid -->
    <div class="container-fluid menu-hidden">
        <!-- Content -->
        <div id="content">
            
            
            
            <!-- // END navbar -->
            <div class="container">
                <!-- row-app -->
                <div class="row row-app">
                    <!-- col -->
                    <!-- col-separator.box -->
                    <div class="col-separator col-unscrollable box">
                        <!-- col-table -->
                        <div class="col-table">
                            <h4 class="innerAll margin-none border-bottom text-center"><i class="fa fa-lock"></i> Login Portalcom</h4>
                            <!-- col-table-row -->
                            <div class="col-table-row">
                                <!-- col-app -->
                                <div class="col-app col-unscrollable">
                                    <!-- col-app -->
                                    <div class="col-app">
                                        <div class="login">
                                            <div class="placeholder text-center"><i class="fa fa-lock"></i>
                                            </div>
                                            <div class="panel panel-default col-md-4 col-sm-6 col-sm-offset-3 col-md-offset-4">
                                                <div class="panel-body">
                                                    <form role="form" action="/automag/portalcom/autentica">
                                                        <div class="form-group">
                                                            <label for="exampleInputEmail1">Email address</label>
                                                            <input type="email" class="form-control" id="email" value="${email!""}" placeholder="Email">
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="exampleInputPassword1">Senha</label>
                                                            <input type="password" class="form-control" id="senha" value="${senha!""}" placeholder="Senha">
                                                        </div>
                                                        <button type="submit" class="btn btn-primary btn-block">Login</button>
                                                        <div class="checkbox">
                                                            <label>
                                                                <input type="checkbox">Remember my details
                                                            </label>
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                            <div class="col-sm-4 col-sm-offset-4 text-center">
                                                <div class="innerAll">
                                                    <a href="signup.html?lang=en" class="btn btn-info">Create a new account? <i class="fa fa-pencil"></i> </a>
                                                    <div class="separator"></div>
                                                </div>
                                            </div>
                                            <div class="clearfix"></div>
                                        </div>
                                    </div>
                                    <!-- // END col-app -->
                                </div>
                                <!-- // END col-app.col-unscrollable -->
                            </div>
                            <!-- // END col-table-row -->
                        </div>
                        <!-- // END col-table -->
                    </div>
                    <!-- // END col-separator.box -->
                </div>
                <!-- // END row-app -->
                <!-- Global -->
                <script data-id="App.Config">
                var App = {};
                var basePath = '',
                    commonPath = '../assets/',
                    rootPath = '../',
                    DEV = false,
                    componentsPath = '../assets/components/';
                var primaryColor = '#3695d5',
                    dangerColor = '#b55151',
                    successColor = '#609450',
                    infoColor = '#4a8bc2',
                    warningColor = '#ab7a4b',
                    inverseColor = '#45484d';
                var themerPrimaryColor = primaryColor;
                </script>
                <script src="../assets/components/library/bootstrap/js/bootstrap.min.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
                <script src="../assets/components/plugins/nicescroll/jquery.nicescroll.min.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
                <script src="../assets/components/plugins/breakpoints/breakpoints.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
                <script src="../assets/components/plugins/preload/pace/pace.min.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
                <script src="../assets/components/plugins/preload/pace/preload.pace.init.js?v=v1.0.3-rc2&sv=v0.0.1.1"></script>
                <script src="../assets/components/core/js/animations.init.js?v=v1.0.3-rc2"></script>
                <script src="../assets/components/core/js/core.init.js?v=v1.0.3-rc2"></script>
</body>
</html>