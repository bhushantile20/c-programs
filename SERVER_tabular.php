<?php

echo"<table border=1>";
echo"<tr>";
echo"<th>KEY</th>";
echo"</tr>";
foreach($_SERVER as $k=>$v)

     echo"<tr>";
     echo"<td>".$k."</td>";
     echo"<td>".$v."</td>;
     echo"</tr>";
}
echo"</table>";

}