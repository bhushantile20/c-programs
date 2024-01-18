<?php
$style=$_POST['style'];
$size=$_POST['size'];
$color=$_POST['color'];
$backcolor=$_POST['backcolor'];
setCookie('fstyle',$style);
setCookie('fsize',$size);
setCookie('fize',$color);
setCookie('fcolor',$color);
setCookie('bcolor',$backcolor);
?>
<h2>Accetpted values arae stored in cookie</h2><br>
<form action="cookie2.php" method ="POST">
    <input type="submit">
</form>
