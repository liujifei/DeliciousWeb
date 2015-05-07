<!DOCTYPE html>
<!--[if lt IE 7]><html class="lt-ie9 lt-ie8 lt-ie7" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en"><![endif]-->
<!--[if IE 7]><html class="lt-ie9 lt-ie8" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en"><![endif]-->
<!--[if IE 8]><html class="lt-ie9" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en"><![endif]-->
<!--[if gt IE 8]><!--><html xmlns="http://www.w3.org/1999/xhtml"><!--<![endif]-->
<html>
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width" />
  <title>Carote - App Landing Page</title>

  <link rel="stylesheet" href="css/normalize.css" />
  <link rel="stylesheet" href="css/foundation.min.css" />
  <link rel="stylesheet" href="css/style.css" />

  <script src="<%=request.getContextPath() %>/js/vendor/custom.modernizr.js"></script>
</head>
<body>
	<form method="post" action="<%=request.getContextPath() %>/book.do?method=add">
	bookname:<input type="text" name="name" id="name">
	author:<input type="text" name="author" id="author">
	<input type="submit" value="Add">
	</form>
	<div class="row" style="text-align: center; padding: 20px 0;">
		<img src="../img/logo.png" alt="" style="display: inline-block">
		<h3 style="padding-top: 20px;">Howdy! Please choose an edition</h3>
	</div>
<div style="background-color: #fcb040; padding: 100px 0;">
	<div class="row" style="text-align: center;">
		<div class="large-12 columns">
			<ul class="large-block-grid-3">
				<li><a href="index-iphone.html"><img src="<%=request.getContextPath() %>/img/edition-iphone.png" style="border: 3px solid white;"></a></li>
				<li><a href="index-ipad.html"><img src="../img/edition-ipad.png" style="border: 3px solid white;"></a></li>
				<li><a href="index-macbook.html"><img src="img/edition-macbook.png" style="border: 3px solid white;"></a></li>
  			</ul>
		</div>
	</div>	
</div>
  <script>
  document.write('<script src=' +
  ('__proto__' in {} ? 'js/vendor/zepto' : 'js/vendor/jquery-1.9.1.min') +
  '.js><\/script>')
  </script>
  
  <script src="../js/foundation.min.js"></script>
   
  <script>
    $(document).foundation();
  </script>
</body>
</html>
