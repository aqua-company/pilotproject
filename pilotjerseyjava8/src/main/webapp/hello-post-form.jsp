<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ja">
<head>
	<meta charset="UTF-8">
	<title>Jerseyテスト | webmaster-pacheパイロット</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
	<meta name="description" content="Jerseyフレームワークのパイロットページです">
	<meta name="keywords" content="">
	<meta name="robots" content="index,follow">
	<meta name="format-detection" content="telephone=no">
</head>

<body>
	<div class="wrapper">
		<div class="contents">
			<div class="top-header">
			</div>
			<div class="top-main">
				<ul class="top-main-contents">
					<li>
						<a href="webapi/hello-string">ハロー</a>
					</li>
				</ul>
			</div><!--/.top-main-->

			<div class="middel">
				<form name="submitForm" action="webapi/hello-post" method="POST" enctype="multipart/formdata">
					<input type="hidden" name="hoge" value="hage2" />
					<input type="text" name="hoge2" value="hage3" />
					<input type="submit" value="送信" />
				</form>
			</div><!--/.middel-->

			<div class="footer clearfix">
				<div class="footer-link-group">
					<ul>
						<li><a href="http://www.google.co.jp/">会社概要</a></li>
						<li><a href="http://www.google.co.jp/" target="_blank">プライバシーポリシー</a></li>
						<li><a href="http://www.google.co.jp/" target="_blank">ご利用規約</a></li>
						<li class="pc"><a href="http://www.google.co.jp/">お問い合わせ／よくある質問と答え</a></li>
						<li class="sp"><a href="http://www.google.co.jp/">お問い合わせ</a></li>
					</ul>
				</div>
				<div class="footer-logo-group">
					<p><a href="http://www.google.co.jp/" target="_blank">テスト</a></p>
					<p class="footer-logo-text"><a href="http://www.google.co.jp/" target="_blank">グループサイトへ</a></p>
				</div>
			</div><!--/.footer-->

		</div><!--/.contents-->
	</div><!--/.wrapper-->
</body>
</html>
