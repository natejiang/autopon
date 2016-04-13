<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>设备管理</title>
<link rel="stylesheet" href="css/style.default.css" type="text/css" />
<script type="text/javascript" src="js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="js/plugins/jquery.autogrow-textarea.js"></script>
<script type="text/javascript" src="js/plugins/jquery.colorbox-min.js"></script>
<script type="text/javascript" src="js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="js/custom/general.js"></script>
<script type="text/javascript" src="js/custom/newsfeed.js"></script>
<!--[if IE 9]>
    <link rel="stylesheet" media="screen" href="css/style.ie9.css"/>
<![endif]-->
<!--[if IE 8]>
    <link rel="stylesheet" media="screen" href="css/style.ie8.css"/>
<![endif]-->
<!--[if lt IE 9]>
	<script src="js/plugins/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body class="withvernav">
<div class="bodywrapper">
    <div class="topheader">
        <div class="left">
            <h1 class="logo">Ama.<span>Admin</span></h1>
            <span class="slogan">后台管理系统</span>
            
            <div class="search">
            	<form action="" method="post">
                	<input type="text" name="keyword" id="keyword" value="Enter keyword(s)" />
                    <button class="submitbutton"></button>
                </form>
            </div><!--search-->
            
            <br clear="all" />
            
        </div><!--left-->
        
        <div class="right">
        	<!--<div class="notification">
                <a class="count" href="http://demo.themepixels.com/webpage/amanda/ajax/notifications.html"><span>9</span></a>
        	</div>
			-->
            <div class="userinfo">
            	<img src="images/thumbs/avatar.png" alt="" />
                <span>Juan Dela Cruz</span>
            </div><!--userinfo-->
            
            <div class="userinfodrop">            	<div class="avatar">
                	<a href=""><img src="images/thumbs/avatarbig.png" alt="" /></a>
                    <div class="changetheme">
                    	Change theme: <br />
                    	<a class="default"></a>
                        <a class="blueline"></a>
                        <a class="greenline"></a>
                        <a class="contrast"></a>
                        <a class="custombg"></a>
                    </div>
                </div><!--avatar-->
<div class="userdata">
                	<h4>Juan Dela Cruz</h4>
                    <span class="email">youremail@yourdomain.com</span>
                    <ul>
                    	<li><a href="editprofile.html">Edit Profile</a></li>
                        <li><a href="accountsettings.html">Account Settings</a></li>
                        <li><a href="amanda/help.html">Help</a></li>
                        <li><a href="index.html">Sign Out</a></li>
                    </ul>
                </div><!--userdata-->
            </div><!--userinfodrop-->
        </div><!--right-->
    </div><!--topheader-->
    
    
    <div class="header">
    	<ul class="headermenu">
        	<li><a href="dashboard.html"><span class="icon icon-flatscreen"></span>Dashboard</a></li>
            <li><a href="manageblog.html"><span class="icon icon-pencil"></span>Manage Blog</a></li>
            <li><a href="messages.html"><span class="icon icon-message"></span>Messages</a></li>
            <li><a href="reports.html"><span class="icon icon-chart"></span>Reports</a></li>
        </ul>
        
        <div class="headerwidget">
        	<div class="earnings">
            	<div class="one_half">
                	<h4>Today's Earnings</h4>
                    <h2>$640.01</h2>
                </div><!--one_half-->
                <div class="one_half last alignright">
                	<h4>Current Rate</h4>
                    <h2>53%</h2>
                </div><!--one_half last-->
            </div><!--earnings-->
        </div><!--headerwidget-->
        
    </div><!--header-->
    
    <div class="vernav2 iconmenu">
    	<ul>
        	<li><a href="#formsub" class="editor">Forms</a>
            	<span class="arrow"></span>
            	<ul id="formsub">
               		<li><a href="forms.html">Basic Form</a></li>
                    <li><a href="wizard.html">Wizard</a></li>
                    <li><a href="editor.html">WYSIWYG</a></li>
                </ul>
            </li>
            <!--<li><a href="filemanager.html" class="gallery">File Manager</a></li>-->
            <li><a href="elements.html" class="elements">Elements</a></li>
            <li><a href="widgets.html" class="widgets">Widgets</a></li>
            <li><a href="calendar.html" class="calendar">Calendar</a></li>
            <li><a href="support.html" class="support">Customer Support</a></li>
            <li><a href="typography.html" class="typo">Typography</a></li>
            <li><a href="tables.html" class="tables">Tables</a></li>
			<li><a href="buttons.html" class="buttons">Buttons &amp; Icons</a></li>
            <li><a href="#error" class="error">Error Pages</a>
            	<span class="arrow"></span>
            	<ul id="error">
               		<li><a href="notfound.html">Page Not Found</a></li>
                    <li><a href="forbidden.html">Forbidden Page</a></li>
                    <li><a href="internal.html">Internal Server Error</a></li>
                    <li><a href="offline.html">Offline</a></li>
                </ul>
            </li>
            <li class="current"><a href="#addons" class="addons">Addons</a>
            	<span class="arrow"></span>
            	<ul id="addons">
               		<li class="current"><a href="newsfeed.html">News Feed</a></li>
                    <li><a href="profile.html">Profile Page</a></li>
                    <li><a href="productlist.html">Product List</a></li>
                    <li><a href="photo.html">Photo/Video Sharing</a></li>
                    <li><a href="gallery.html">Gallery</a></li>
                    <li><a href="invoice.html">Invoice</a></li>
                </ul>
            </li>
        </ul>
        <a class="togglemenu"></a>
        <br /><br />
    </div><!--leftmenu-->
        
    <div class="centercontent">
    
        <div class="pageheader">
            <h1 class="pagetitle">News Feed</h1>
            <span class="pagedesc">This is a sample description of a page</span>
            
            <ul class="hornav">
                <li class="current"><a href="#status">Status</a></li>
                <li><a href="#photo">Photo/Video</a></li>
            </ul>
        </div><!--pageheader-->
        
        <div class="contentwrapper">
        
        	<div class="two_third newsfeed">
        
                <div id="status" class="subcontent">
                
                    <div class="statusbox">
                        <form id="poststatus" action="ajax/newsfeed/status.php" method="post">
                            <div class="status_thumb"><img src="../../images/thumbs/avatarbig.png" alt="" width="57" /></div>
                            <div class="status_content">
                                <textarea name="" cols="" rows="" id="statustext"></textarea>
                            </div>
                            <div class="submit"><button class="stdbtn btn_yellow">Post</button></div>
                        </form>
                    </div><!--statusbox-->
                                    
                    
                    <br clear="all" /><br />
                    
                </div><!-- #updates -->
                
                <div id="photo" class="subcontent" style="display: none;">
                
                    <div class="statusbox">
                        <form id="postphoto" action="ajax/newsfeed/status.php" method="post">
                            <div class="status_thumb"><img src="../../images/thumbs/avatarbig.png" alt="" width="57" /></div>
                            <div class="status_content">
                                <textarea name="" cols="" rows="" id="statusphoto"></textarea>
                            </div>
                            
                            <div class="submit">
                            	<div class="photoupload"><input type="file" name="photoupload" /></div>
                            	<button class="stdbtn btn_yellow">Post</button>
                            </div>
                        </form>
                    </div><!--statusbox-->
                </div><!-- #photo -->
                
                <br />
                
                <ul class="updatelist">
                	<li>
                    	<div class="updatethumb"><img src="images/thumbs/avatar1.png" alt="" /></div>
                        <div class="updatecontent">
                        	<div class="top">
                            	<a href="" class="user">Agnes</a> - <a href="">0 Comment</a> - 
                                <a href="">Share</a> - <a href="">Report</a> - <span>7 minutes ago</span>
                            </div><!--top-->
                            <div class="text">
                            	Unicorns, I love them. Unicorns, I love them. Uni uni unicorns, I love them. Uni unicorns, I could pet one if they were really real. And they are! So I bought one so I could pet it. Now it loves me, now I love it. La lala la la... 
                            </div><!--text-->
                        </div><!--updatecontent-->
                    </li>
                    
                    <li>
                    	<div class="updatethumb"><img src="images/thumbs/avatar2.png" alt="" /></div>
                        <div class="updatecontent">
                        	<div class="top">
                            	<a href="" class="user">Vector</a> - <a href="">2 Comments</a> - <a href="">Share</a> - <a href="">Report</a> - <span>1 hour ago</span>
                            </div><!--top-->
                            <div class="text">Some stuff... </div><!--text-->
                            <div class="photo">
                            	<a href="http://demo.themepixels.com/webpage/amanda/ajax/newsfeed/photo.html"><img src="images/preview/preview1.png" alt="" /></a>
                            </div><!--text-->
                        </div><!--updatecontent-->
                    </li>
                    
                    <li>
                    	<div class="updatethumb"><img src="images/thumbs/avatar3.png" alt="" /></div>
                        <div class="updatecontent">
                        	<div class="top">
                            	<a href="" class="user">Fat Boy</a> - <a href="">1 Comment</a> - <a href="">Share</a> - <a href="">Report</a> - <span>1 hour ago</span>
                            </div><!--top-->
                            <div class="text">These are Cheeto. </div><!--text-->
                            <div class="photo">
                            	<a href="http://demo.themepixels.com/webpage/amanda/ajax/newsfeed/photo2.html"><img src="images/preview/preview2.png" alt="" /></a>
                            </div><!--text-->
                        </div><!--updatecontent-->
                    </li>
                    
                	<li>
                    	<div class="updatethumb"><img src="images/thumbs/avatar4.png" alt="" /></div>
                        <div class="updatecontent">
                        	<div class="top">
                            	<a href="" class="user">Agnes</a> - <a href="">0 Comment</a> - 
                                <a href="">Share</a> - <a href="">Report</a> - <span>7 minutes ago</span>
                            </div><!--top-->
                            <div class="text">
                            	No one just *gets* as good as you do. *Especially* you. Start talking! Are you training with someone? 
                            </div><!--text-->
                        </div><!--updatecontent-->
                    </li>
                </ul>

            
            </div><!--two_third newsfeed-->
            
            <br clear="all" />
        
        </div><!--contentwrapper-->
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
