# Powershell Modulo 4 y 5
> **Realizado por Manuel Quintero**
## Modulo 4

#### 1. Mostrar una tabla de procesos que incluya únicamente los nombres de los procesos, sus IDs, y si están respondiendo a Windows (la propiedad `Responding` muestra eso). Haga que la tabla tome el mínimo de espacio horizontal, pero no permita que la información se trunque.

El comando que se utilizo fue:

> `Get-Process | ft -Property Name,ID,Responding -AutoSize -Wrap. ` 

Cuyo resultado fue el siguiente:
```
Name                                                              Id Responding
----                                                              -- ----------
AdaptiveSleepService                                            7688       True
AnyDesk                                                         3948       True
AnyDesk                                                         7860       True
ApplicationFrameHost                                            4828       True
armsvc                                                          3940       True
atieclxx                                                        2084       True
atiesrxx                                                        1924       True
audiodg                                                        10576       True
avgnt                                                          11124       True
avguard                                                         3976       True
Avira.ServiceHost                                               4492       True
Avira.Systray                                                   3148       True
avshadow                                                        7100       True
backgroundTaskHost                                              7436       True
browser_broker                                                 11768       True
BTDevMgr                                                        3996       True
CCleaner64                                                     10444       True
chrome                                                          1308       True
chrome                                                          3320       True
chrome                                                          5516       True
chrome                                                          7260       True
chrome                                                          7564       True
chrome                                                         10888       True
chrome                                                         11336       True
chrome                                                         11424       True
chrome                                                         11484       True
chrome                                                         11512       True
chrome                                                         11544       True
chrome                                                         11592       True
chrome                                                         11672       True
chrome                                                         11856       True
chrome                                                         12060       True
chrome                                                         12196       True
chrome                                                         12220       True
chrome                                                         12580       True
conhost                                                         5820       True
CoolSense                                                      10052       True
csrss                                                            648       True
csrss                                                            816       True
ctfmon                                                          9016       True
dasHost                                                         4444       True
dllhost                                                         5904       True
dllhost                                                         9432       True
dllhost                                                         9584       True
DropboxUpdate                                                   6944       True
dwm                                                             1216       True
ETDCtrl                                                         3116       True
ETDCtrlHelper                                                   8600       True
ETDService                                                      4056       True
ETDTouch                                                        9068       True
explorer                                                        9188       True
fontdrvhost                                                      660       True
fontdrvhost                                                      688       True
HPAudioSwitch                                                   8464       True
HPCommRecovery                                                  4776       True
HPJumpStartBridge                                               3408       True
HPJumpStartLaunch                                               8520       True
HPOrbitService                                                  5144       True
hpqwmiex                                                       11828       True
HPSupportSolutionsFrameworkService                              8096       True
HPWMISVC                                                        2928       True
Idle                                                               0       True
jtagserver                                                      3864       True
LockApp                                                         8828       True
lsass                                                            880       True
mDNSResponder                                                   3932       True
Memory Compression                                              2512       True
MicrosoftEdge                                                   5648      False
MicrosoftEdgeCP                                                 6304      False
MicrosoftEdgeSH                                                13280       True
NetFaxServer64                                                  4188       True
notepad                                                        11848       True
OfficeClickToRun                                                4016       True
postgres                                                        5812       True
postgres                                                        6416       True
postgres                                                        7928       True
postgres                                                        7936       True
postgres                                                        7944       True
postgres                                                        7952       True
postgres                                                        7964       True
postgres                                                        8012       True
powershell_ise                                                  4808       True
ProtectedService                                                3960       True
RadeonSettings                                                  7820       True
Registry                                                         104       True
RtkAudioService64                                               3164       True
RtkBtManServ                                                    4164       True
RtkNGUI64                                                       8812       True
rundll32                                                       13224       True
RuntimeBroker                                                   4276       True
RuntimeBroker                                                   4980       True
RuntimeBroker                                                   5196       True
RuntimeBroker                                                   5208       True
RuntimeBroker                                                   5720       True
RuntimeBroker                                                   9532       True
RuntimeBroker                                                   9668       True
RuntimeBroker                                                  10168       True
RuntimeBroker                                                  10296       True
sched                                                           3676       True
SearchFilterHost                                                7816       True
SearchIndexer                                                   3696       True
SearchProtocolHost                                              7576       True
SearchUI                                                       10996       True
SecurityHealthService                                          11440       True
services                                                         872       True
SettingSyncHost                                                10672       True
SgrmBroker                                                      7620       True
ShellExperienceHost                                            11700       True
sihost                                                          7096       True
SkypeApp                                                        7924       True
SkypeBackgroundHost                                             7420       True
SkypeBridge                                                     6400       True
slack                                                           1836       True
slack                                                           7604       True
slack                                                           7696       True
slack                                                           9616       True
slack                                                          10564       True
smss                                                             444       True
spoolsv                                                         3640       True
StartMenuExperienceHost                                         9384       True
svchost                                                          496       True
svchost                                                          652       True
svchost                                                         1064       True
svchost                                                         1120       True
svchost                                                         1264       True
svchost                                                         1344       True
svchost                                                         1420       True
svchost                                                         1484       True
svchost                                                         1516       True
svchost                                                         1568       True
svchost                                                         1640       True
svchost                                                         1652       True
svchost                                                         1700       True
svchost                                                         1712       True
svchost                                                         1720       True
svchost                                                         1896       True
svchost                                                         1968       True
svchost                                                         1988       True
svchost                                                         2044       True
svchost                                                         2168       True
svchost                                                         2176       True
svchost                                                         2204       True
svchost                                                         2212       True
svchost                                                         2236       True
svchost                                                         2244       True
svchost                                                         2256       True
svchost                                                         2396       True
svchost                                                         2408       True
svchost                                                         2456       True
svchost                                                         2476       True
svchost                                                         2564       True
svchost                                                         2712       True
svchost                                                         2776       True
svchost                                                         2848       True
svchost                                                         2860       True
svchost                                                         3032       True
svchost                                                         3104       True
svchost                                                         3228       True
svchost                                                         3244       True
svchost                                                         3380       True
svchost                                                         3472       True
svchost                                                         3500       True
svchost                                                         3544       True
svchost                                                         3684       True
svchost                                                         3788       True
svchost                                                         3920       True
svchost                                                         3968       True
svchost                                                         3984       True
svchost                                                         4004       True
svchost                                                         4024       True
svchost                                                         4040       True
svchost                                                         4104       True
svchost                                                         4156       True
svchost                                                         4204       True
svchost                                                         4280       True
svchost                                                         4356       True
svchost                                                         4476       True
svchost                                                         4484       True
svchost                                                         4516       True
svchost                                                         4644       True
svchost                                                         4968       True
svchost                                                         5060       True
svchost                                                         5604       True
svchost                                                         5952       True
svchost                                                         5960       True
svchost                                                         6068       True
svchost                                                         7160       True
svchost                                                         7284       True
svchost                                                         7700       True
svchost                                                         7732       True
svchost                                                         8072       True
svchost                                                         8272       True
svchost                                                         8280       True
svchost                                                         8332       True
svchost                                                         8340       True
svchost                                                         8412       True
svchost                                                         8692       True
svchost                                                         8772       True
svchost                                                         9132       True
svchost                                                        10096       True
svchost                                                        10248       True
svchost                                                        10472       True
svchost                                                        10608       True
svchost                                                        10868       True
svchost                                                        12888       True
svchost                                                        13556       True
System                                                             4       True
SystemSettings                                                 12928      False
taskhostw                                                       8548       True
tbaseprovisioning                                               1948       True
TeamViewer_Service                                              4316       True
vmnat                                                           4348       True
vmnetdhcp                                                       4328       True
vmware-authd                                                    4508       True
vmware-usbarbitrator64                                          4500       True
WindowsInternal.ComposableShell.Experiences.TextInput.InputApp  9744       True
wininit                                                          800       True
winlogon                                                         960       True
WmiPrvSE                                                        2284       True
YourPhone                                                       5520       True
```

#### 2. Muestre una tabla de procesos que incluya los nombres de los procesos y sus IDs. También incluya columnas para uso de memoria virtual y física; exprese dichos valores en megabytes (MB).

El comando utilizado fue:
> ``Get-Process | ft Name,ID,@{n='VM(MB)';e={$_.VM/1MB}},@{n='PM(MB)';e={$_.PM/1MB}} -AutoSize -Wrap``

Cuyo resultado fue: 
```
Name                                                              Id           VM(MB)       PM(MB)
----                                                              --           ------       ------
AdaptiveSleepService                                            7672        4183,6875   1,63671875
AnyDesk                                                         3760        90,328125       16,125
AnyDesk                                                        13148        106,71875   16,0703125
ApplicationFrameHost                                           12044   2101471,453125    8,5078125
armsvc                                                          3752      43,27734375    1,3515625
atiesrxx                                                        1768     4167,0859375   1,33984375
audiodg                                                        14416  2101756,2890625 368,37890625
avgnt                                                          14768     129,28515625    6,5234375
avguard                                                         3784      467,1640625 249,50390625
Avira.ServiceHost                                               4220          198,625  35,70703125
Avira.Systray                                                   2720     474,17578125  68,86328125
avshadow                                                        9088        4185,9375   1,91796875
browser_broker                                                 10300   2101340,890625   1,59765625
BTDevMgr                                                        3744    4200,75390625   4,87109375
CCleaner64                                                      4892    4307,66796875  10,91015625
chrome                                                           380  2101390,8046875    1,6328125
chrome                                                          1592   2105742,734375   36,7421875
chrome                                                          2516 2105753,44140625  92,75390625
chrome                                                          2684 2101641,51171875  21,52734375
chrome                                                          4532 2105763,28515625    50,359375
chrome                                                          5732  2102187,7265625   172,015625
chrome                                                          6732 2106082,64453125    211,28125
chrome                                                          9832     2105691,4375  12,51953125
chrome                                                         10424  2102122,0390625 201,27734375
chrome                                                         12212 2101373,04296875   1,89453125
chrome                                                         12264  2101574,4296875     7,015625
chrome                                                         13416     2105695,6875     16,53125
chrome                                                         15252 2105704,00390625  20,59765625
conhost                                                         4880   2101343,140625     6,578125
CoolSense                                                       8400            97,25   2,29296875
csrss                                                            644    2101341,28125   1,85546875
csrss                                                          10072  2101369,6953125    3,2578125
ctfmon                                                         10516  2101368,0859375   3,85546875
dasHost                                                         4508  2101319,3515625   3,74609375
dllhost                                                         2432 2101332,79296875    1,4609375
dllhost                                                         6960 2101468,97265625    3,3359375
dllhost                                                        12692 2101492,41015625     4,390625
DropboxUpdate                                                   6940      62,05859375    2,0546875
dwm                                                            10404 2101615,92578125  54,47265625
ETDCtrl                                                         1900     4252,6640625   6,54296875
ETDCtrlHelper                                                   2268        4216,5625   2,83203125
ETDService                                                      3868    4160,09765625   1,12109375
ETDTouch                                                       14552    4204,03515625   2,23046875
explorer                                                        9620 2101936,37890625  87,09765625
fontdrvhost                                                      528   2101314,859375   1,62890625
fontdrvhost                                                     4912 2101418,16015625     4,046875
gitkraken                                                       9052   2101932,515625 140,14453125
gitkraken                                                      10084       2103106,75 417,94921875
gitkraken                                                      10228 2101930,76953125   172,578125
gitkraken                                                      13432 2101538,70703125   10,8359375
gitkraken                                                      15216     2101489,4375    7,1484375
HPAudioSwitch                                                   4280     308,55078125  36,12890625
HPCommRecovery                                                  9488      4647,484375  13,19921875
HPJumpStartBridge                                               9004      159,6640625  15,73828125
HPJumpStartLaunch                                               3056       91,3203125   3,84765625
HPOrbitService                                                  4548    4218,04296875   3,73828125
hpqwmiex                                                       11540      57,13671875    2,0234375
HPSupportSolutionsFrameworkService                             10732         4665,875    28,515625
HPWMISVC                                                        3940      41,98828125   1,31640625
Idle                                                               0        0,0078125   0,05859375
jtagserver                                                      4056     4219,8828125  39,84765625
LockApp                                                          896  2101602,7578125  13,33984375
lsass                                                            956 2101335,31640625   7,66796875
mDNSResponder                                                   3768     4165,7265625    2,7890625
Memory Compression                                              3008            65,75   0,32421875
MicrosoftEdge                                                  11040 2101813,19921875  22,90234375
MicrosoftEdgeCP                                                 4560  2134221,1484375   5,77734375
MicrosoftEdgeSH                                                 8476 2134168,58203125   3,78515625
NetFaxServer64                                                  3584     4204,4140625   2,55859375
notepad                                                         7304  2101404,0234375   3,07421875
notepad                                                        10896  2101403,5234375   2,98828125
OfficeClickToRun                                                3828 2101490,85546875  38,60546875
pg_ctl                                                          4084     4189,9609375          1,5
postgres                                                        2136    4395,37109375    3,2109375
postgres                                                        2492      4347,484375    2,0390625
postgres                                                        2836      4348,484375   2,90234375
postgres                                                        5820    4351,55078125   2,07421875
postgres                                                        5976      4347,484375     2,390625
postgres                                                        5980      4347,484375     2,359375
postgres                                                        6004      4347,484375     2,328125
postgres                                                        6008      4348,484375   2,98046875
powershell_ise                                                  7452     5133,5390625  136,3203125
ProtectedService                                                3792      57,51953125   3,36328125
RadeonSettings                                                 11148       4533,96875 158,03515625
Registry                                                         104      181,5859375  19,16796875
RtkAudioService64                                               2496     4193,1953125   1,95703125
RtkBtManServ                                                     792    4182,75390625     4,078125
RtkNGUI64                                                       7320    4249,41015625    4,6640625
rundll32                                                       10472    2101342,21875        1,875
RuntimeBroker                                                   1496  2101442,8515625      8,21875
RuntimeBroker                                                   5184  2101400,1328125   6,19140625
RuntimeBroker                                                   5576  2101415,8359375      5,09375
RuntimeBroker                                                   6188    2101504,96875   13,6484375
RuntimeBroker                                                   6332 2101425,11328125   7,03515625
RuntimeBroker                                                   8336 2101390,69140625   6,01171875
RuntimeBroker                                                  14620 2101336,54296875     1,515625
RuntimeBroker                                                  14820 2101362,78515625   2,83203125
sched                                                           3536        93,328125   6,65234375
SearchFilterHost                                                8932   2101315,640625       1,4375
SearchIndexer                                                   1540 2101647,16796875  44,28515625
SearchProtocolHost                                              3332  2101350,4765625    4,1171875
SearchUI                                                        5308    2135020,15625 114,08984375
SecurityHealthService                                           9348   2101333,078125   3,10546875
services                                                         944 2101312,84765625   5,92578125
SettingSyncHost                                                13592 2101384,66796875      5,65625
SgrmBroker                                                     10080 2101303,93359375   3,76953125
ShellExperienceHost                                             2108 2101669,60546875  20,73046875
sihost                                                          5152 2101406,98828125   6,77734375
SkypeApp                                                       14228    38198,9609375    196,40625
SkypeBackgroundHost                                              936  2101345,5859375    1,9296875
SkypeBridge                                                    13152        4851,0625  33,77734375
smss                                                             440    2101287,53125   1,13671875
spoolsv                                                         3492     2101372,0625     7,890625
StartMenuExperienceHost                                         9416 2101568,56640625   24,1953125
svchost                                                          460  2101416,9765625  15,58984375
svchost                                                          492   2101304,234375    0,9453125
svchost                                                         1064 2101354,86328125   9,83203125
svchost                                                         1128    2101330,03125   3,05078125
svchost                                                         1288 2101328,68359375   2,55859375
svchost                                                         1316 2101329,96484375    2,5546875
svchost                                                         1364  2101331,0390625   2,16015625
svchost                                                         1460  2101322,3984375   1,63671875
svchost                                                         1488 2101321,57421875   2,21484375
svchost                                                         1576 2101321,36328125     1,765625
svchost                                                         1580 2101355,21484375  14,60546875
svchost                                                         1808     2101341,5625   2,35546875
svchost                                                         1840 2101318,65234375   5,26171875
svchost                                                         1892 2101320,85546875   2,76953125
svchost                                                         1944 2101316,41796875    1,4765625
svchost                                                         2016 2101333,80859375    2,1484375
svchost                                                         2076  2101353,2109375   5,19921875
svchost                                                         2084 2101340,28515625      3,96875
svchost                                                         2152   2101341,015625   6,61328125
svchost                                                         2176 2101325,33984375    1,9765625
svchost                                                         2232 2101334,01953125   2,44140625
svchost                                                         2248 2101351,79296875    6,8828125
svchost                                                         2312 2101419,86328125   4,37109375
svchost                                                         2360  2101324,4453125   3,25390625
svchost                                                         2380 2101331,44140625     2,234375
svchost                                                         2412 2101322,37109375    1,8671875
svchost                                                         2468 2101352,42578125   2,66015625
svchost                                                         2592  2101329,4453125   2,91015625
svchost                                                         2664 2101355,32421875   4,00390625
svchost                                                         2688  2101320,5859375   2,23046875
svchost                                                         2748        2101351,5    1,8828125
svchost                                                         2880 2101332,76953125   2,79296875
svchost                                                         2920 2105540,83203125     114,8125
svchost                                                         2928   2101317,421875   1,27734375
svchost                                                         2944 2101323,86328125   1,99609375
svchost                                                         3068   2101330,109375   2,23046875
svchost                                                         3168 2101317,08203125       1,8125
svchost                                                         3176 2101333,50390625     3,140625
svchost                                                         3272  2101318,0546875    1,5859375
svchost                                                         3404   2101367,609375      6,59375
svchost                                                         3428 2101351,18359375   2,72265625
svchost                                                         3544  2101363,8828125   13,9921875
svchost                                                         3808  2101346,3359375    6,8671875
svchost                                                         3816  2101319,0234375      2,15625
svchost                                                         3836  2101526,8671875   6,76953125
svchost                                                         3844     2101402,0625  15,73046875
svchost                                                         3856  2101502,3828125   32,0703125
svchost                                                         4028    2101362,96875     6,078125
svchost                                                         4124 2101313,48828125       1,3125
svchost                                                         4160 2101328,08203125      2,34375
svchost                                                         4180  2101350,0078125   2,35546875
svchost                                                         4260 2101330,38671875    2,0859375
svchost                                                         4320 2101332,12890625   3,62890625
svchost                                                         4328  2101375,4296875    4,9921875
svchost                                                         4360  2101314,5859375       1,3125
svchost                                                         4388 2101317,94140625   1,59765625
svchost                                                         4848 2101347,73828125    3,5703125
svchost                                                         5060  2101335,4140625    1,7890625
svchost                                                         5104 2101328,20703125     2,765625
svchost                                                         5996 2101319,86328125    1,6953125
svchost                                                         6020  2101317,6796875   1,79296875
svchost                                                         6512    2101355,84375    4,2109375
svchost                                                         6628 2101642,33984375   5,65234375
svchost                                                         7468   2101330,546875      1,96875
svchost                                                         7620     2101368,3125    5,2421875
svchost                                                         7664 2101327,23828125     4,015625
svchost                                                         8780 2101325,51171875        2,375
svchost                                                         9028 2101318,82421875         3,25
svchost                                                         9328 2101341,57421875   2,26171875
svchost                                                         9556    2101538,21875  14,18359375
svchost                                                         9640 2101341,58203125     2,984375
svchost                                                         9672  2101333,3203125          2,5
svchost                                                         9932 2101350,32421875   4,10546875
svchost                                                        10432 2101338,56640625   2,66796875
svchost                                                        10608 2101364,54296875   4,32421875
svchost                                                        10632   2101595,734375   6,12109375
svchost                                                        10932 2101391,81640625   10,3984375
svchost                                                        11408 2101400,76171875    5,1640625
svchost                                                        14188 2101446,87890625   9,00390625
svchost                                                        14540  2101402,5859375     3,515625
System                                                             4          18,3125   0,22265625
taskhostw                                                      13372  2101494,8515625   5,83203125
tbaseprovisioning                                               1776      123,4765625  10,44140625
TeamViewer_Service                                              4132     120,71484375    6,4296875
vmnat                                                           4240      76,45703125    2,4921875
vmnetdhcp                                                       4196        63,609375      7,59375
vmware-authd                                                    4284      119,6484375   6,21484375
vmware-usbarbitrator64                                          4228     4191,2890625   2,58984375
WindowsInternal.ComposableShell.Experiences.TextInput.InputApp 11700   2101574,671875   14,6640625
wininit                                                          800 2101314,43359375       1,4375
winlogon                                                       11616 2101345,31640625    2,5859375
WmiPrvSE                                                        6524 2101369,71484375  15,30078125
WUDFHost                                                        5460  2101329,4765625   2,08203125
YourPhone                                                      10776   2101632,078125   15,8203125
YourPhoneServer                                                 2936  2101370,6796875   2,96484375
```

#### 3. Emplee  `Get-EventLog`  para mostrar una lista de los logs de eventos disponibles (revise la ayuda para encontrar el parámetro que le permitirá obtener dicha información). Formatee la salida como una tabla que incluya el nombre de despliegue del log y el período de retención. Los encabezados de columna deben ser NombreLog y Per-Retencion.

Se ejecuto el comando
> `Get-EventLog | gm`

Esto con el fin de encontrar la propiedad que nos permitiera encontrar el periodo de retención. Es así como se halló la propiedad ``MinimumRetentionDays ``.

De esta manera se ejecuto el siguiente comando:
>``Get-EventLog -List | ft @{n='NombreLog'; e={$_.LogDisplayName}},@{n='PerRetencion';e={$_.MinimumRetentionDays}}``

Cuyo resultado fue el siguiente:
```
NombreLog                            PerRetencion
---------                            ------------
Aplicación                                      0
Eventos de hardware                             0
Hewlett-Packard                                 7
HP 3D DriveGuard                                7
HP CASL Framework                               7
HP Software Framework                           7
Internet Explorer                               7
Servicio de administración de claves            0
Microsoft Office Alerts                         0
Sistema                                         0
Windows PowerShell                              0
```
    
#### 4. Muestre una lista de servicios, de tal manera que aparezcan agrupados los servicios que están iniciados y los que están detenidos. Los que están iniciados deben aparecer primero.
El comando que se ejecuto fue: 
>`Get-Service | sort Status -Descending | ft Name,Status,DisplayName -groupby Status`

Cuyo resultado fue el siguiente:
```
 Status: Running

Name                                Status DisplayName
----                                ------ -----------
SessionEnv                         Running Configuración de Escritorio remoto
HPWMISVC                           Running HPWMISVC
HPSupportSolutionsFrameworkService Running HP Support Solutions Framework Service
hpqwmiex                           Running HP Software Framework Service
PolicyAgent                        Running Agente de directiva IPsec
HPJumpStartBridge                  Running HP JumpStart Bridge
HP Orbit Service                   Running HP Orbit Service
HP Comm Recover                    Running HP Comm Recovery
postgresql-x64-12                  Running postgresql-x64-12 - PostgreSQL Server 12
SgrmBroker                         Running Agente de supervisión en tiempo de ejecución de Protección del sistema
Power                              Running Energía
StorSvc                            Running Servicio de almacenamiento
VMnetDHCP                          Running VMware DHCP Service
VMUSBArbService                    Running VMware USB Arbitration Service
VMware NAT Service                 Running VMware NAT Service
stisvc                             Running Adquisición de imágenes de Windows (WIA)
FontCache                          Running Servicio de caché de fuentes de Windows
ProfSvc                            Running Servicio de perfil de usuario
StateRepository                    Running Servicio de repositorio de estado
SstpSvc                            Running Servicio de protocolo de túnel de sockets seguros
EventSystem                        Running Sistema de eventos COM+
EventLog                           Running Registro de eventos de Windows
ETDService                         Running Elan Service
RasMan                             Running Administrador de conexiones de acceso remoto
SSDPSRV                            Running Detección SSDP
WbioSrvc                           Running Servicio biométrico de Windows
Wcmsvc                             Running Administrador de conexiones de Windows
DusmSvc                            Running Uso de datos
DsSvc                              Running Servicio de uso compartido de datos
WdiServiceHost                     Running Host del servicio de diagnóstico
PlugPlay                           Running Plug and Play
InstallService                     Running Servicio de instalación de Microsoft Store
iphlpsvc                           Running Aplicación auxiliar IP
VMAuthdService                     Running VMware Authorization Service
nsi                                Running Servicio Interfaz de almacenamiento en red
NlaSvc                             Running Reconoc. ubicación de red
Themes                             Running Temas
TeamViewer                         Running TeamViewer 13
TimeBrokerSvc                      Running Agente de eventos de tiempo
TokenBroker                        Running Administrador de cuentas web
netprofm                           Running Servicio de lista de redes
TrkWks                             Running Cliente de seguimiento de vínculos distribuidos
tbaseprovisioning                  Running tbaseprovisioning
PcaSvc                             Running Servicio Asistente para la compatibilidad de programas
NcbService                         Running Agente de conexión de red
TapiSrv                            Running Telefonía
TabletInputService                 Running Servicio de Panel de escritura a mano y teclado táctil
UnistoreSvc_541be69                Running Almacenamiento de datos de usuarios_541be69
OneSyncSvc_541be69                 Running Sincronizar host_541be69
SystemEventsBroker                 Running Agente de eventos del sistema
mpssvc                             Running Firewall de Windows Defender
UserManager                        Running Administrador de usuarios
UsoSvc                             Running Actualizar el servicio Orchestrator
PimIndexMaintenanceSvc_541be69     Running Datos de los contactos_541be69
LSM                                Running Administrador de sesión local
lmhosts                            Running Aplicación auxiliar de NetBIOS sobre TCP/IP
VaultSvc                           Running Administrador de credenciales
LicenseManager                     Running Servicio de administrador de licencias de Windows
lfsvc                              Running Geolocation Service
LanmanWorkstation                  Running Estación de trabajo
LanmanServer                       Running Servidor
SysMain                            Running SysMain
KeyIso                             Running Aislamiento de claves CNG
JTAGServer                         Running Altera JTAG Server
UserDataSvc_541be69                Running Acceso a datos de usuarios_541be69
WdiSystemHost                      Running Host de sistema de diagnóstico
DPS                                Running Servicio de directivas de diagnóstico
Dnscache                           Running Cliente DNS
wlidsvc                            Running Ayudante para el inicio de sesión de cuenta Microsoft
BthAvctpSvc                        Running Servicio AVCTP
BTDevManager                       Running BTDevManager
Browser                            Running Examinador de equipos
BrokerInfrastructure               Running Servicio de infraestructura de tareas en segundo plano
Bonjour Service                    Running Servicio Bonjour
Schedule                           Running Programador de tareas
BFE                                Running Motor de filtrado de base
ShellHWDetection                   Running Detección de hardware shell
SecurityHealthService              Running Servicio de seguridad de Windows
Avira.ServiceHost                  Running Avira Service Host
SEMgrSvc                           Running Payments and NFC/SE Manager
Audiosrv                           Running Audio de Windows
AudioEndpointBuilder               Running Compilador de extremo de audio de Windows
WpnService                         Running Servicio del sistema de notificaciones de inserción de Windows
WpnUserService_541be69             Running Servicio de usuario de notificaciones de inserción de Windows_541be69
Appinfo                            Running Información de la aplicación
wscsvc                             Running Security Center
AnyDesk                            Running AnyDesk Service
WSearch                            Running Windows Search
AntiVirService                     Running Avira Real-Time Protection
AntiVirSchedulerService            Running Avira Programador
AntivirProtectedService            Running Avira Servicio Protegido
wuauserv                           Running Windows Update
AMD External Events Utility        Running AMD External Events Utility
SENS                               Running Servicio de notificación de eventos de sistema
XblAuthManager                     Running Administrador de autenticación de Xbox Live
AdobeARMservice                    Running Adobe Acrobat Update Service
AdaptiveSleepService               Running AdaptiveSleepService
DoSvc                              Running Optimización de entrega
WlanSvc                            Running Configuración automática de WLAN
camsvc                             Running Servicio Administrador de funcionalidad de acceso
RtkBtManServ                       Running Realtek Bluetooth Device Manager Service
Spooler                            Running Cola de impresión
RmSvc                              Running Servicio de administración de radio
DisplayEnhancementService          Running Servicio de mejora de visualización
DispBrokerDesktopSvc               Running Mostrar el servicio de directivas
DiagTrack                          Running Experiencia del usuario y telemetría asociadas
RpcEptMapper                       Running Asignador de extremos de RPC
Dhcp                               Running Cliente DHCP
DevicesFlowUserSvc_541be69         Running DevicesFlow_541be69
DevicePickerUserSvc_541be69        Running DevicePicker_541be69
RpcSs                              Running Llamada a procedimiento remoto (RPC)
DeviceAssociationService           Running Servicio de asociación de dispositivos
RtkAudioService                    Running Realtek Audio Service
cbdhsvc_541be69                    Running Servicio de usuario de Portapapeles_541be69
DcomLaunch                         Running Iniciador de procesos de servidor DCOM
SamSs                              Running Administrador de cuentas de seguridad
TermService                        Running Servicios de Escritorio remoto
CryptSvc                           Running Servicios de cifrado
Winmgmt                            Running Instrumental de administración de Windows
CoreMessagingRegistrar             Running CoreMessaging
CDPSvc                             Running Servicio de plataforma de dispositivos conectados
Samsung Network Fax Server         Running Samsung Network Fax Server
CDPUserSvc_541be69                 Running Servicio de usuario de plataforma de dispositivos conectados_541be69
ClipSVC                            Running Servicio de licencia de cliente (ClipSVC)
WinHttpAutoProxySvc                Running Servicio de detección automática de proxy web WinHTTP
CertPropSvc                        Running Propagación de certificados
ClickToRunSvc                      Running Servicio Hacer clic y ejecutar de Microsoft Office


   Status: Stopped

Name                                        Status DisplayName
----                                        ------ -----------
SharedRealitySvc                           Stopped Servicio de datos espacial
swprv                                      Stopped Proveedor de instantáneas de software de Microsoft
SharedAccess                               Stopped Conexión compartida a Internet (ICS)
smphost                                    Stopped Microsoft Storage Spaces SMP
spectrum                                   Stopped Servicio de percepción de Windows
SNMPTRAP                                   Stopped Captura de SNMP
SmsRouter                                  Stopped Servicio enrutador de SMS de Microsoft Windows.
ssh-agent                                  Stopped OpenSSH Authentication Agent
shpamsvc                                   Stopped Shared PC Account Manager
sppsvc                                     Stopped Protección de software
svsvc                                      Stopped Comprobador puntual
vmictimesync                               Stopped Servicio de sincronización de hora de Hyper-V
TroubleshootingSvc                         Stopped Servicio de solución de problemas recomendada
Wecsvc                                     Stopped Recopilador de eventos de Windows
WEPHOSTSVC                                 Stopped Servicio host de proveedor de cifrado de Windows
wercplsupport                              Stopped Ayuda del Panel de control de Informes de problemas y soluciones
WerSvc                                     Stopped Servicio Informe de errores de Windows
WFDSConMgrSvc                              Stopped Servicio de administrador de conexiones con servicios Wi-Fi Direct
WiaRpc                                     Stopped Still Image Acquisition Events
WinDefend                                  Stopped Servicio de antivirus de Windows Defender
WinRM                                      Stopped Administración remota de Windows (WS-Management)
WebClient                                  Stopped Cliente web
wisvc                                      Stopped Servicio de Windows Insider
WManSvc                                    Stopped Servicio de administración de Windows
wmiApSrv                                   Stopped Adaptador de rendimiento de WMI
WMPNetworkSvc                              Stopped Servicio de uso compartido de red del Reproductor de Windows Media
workfolderssvc                             Stopped Work Folders
WpcMonSvc                                  Stopped Control parental
WPDBusEnum                                 Stopped Servicio enumerador de dispositivos portátiles
WwanSvc                                    Stopped Configuración automática de WWAN
XblGameSave                                Stopped Juegos guardados en Xbox Live
wlpasvc                                    Stopped Servicio de asistente para perfil local
WdNisSvc                                   Stopped Servicio de inspección de red de Antivirus de Windows Defender
wcncsvc                                    Stopped Registrador de configuración de Windows Connect Now
wbengine                                   Stopped Servicio del módulo de copia de seguridad a nivel de bloque
TrustedInstaller                           Stopped Instalador de módulos de Windows
tzautoupdate                               Stopped Actualizador de zona horaria automática
UmRdpService                               Stopped Redirector de puerto en modo usuario de Servicios de Escritorio remoto
upnphost                                   Stopped Dispositivo host de UPnP
VacSvc                                     Stopped Servicio Volumetric Audio Compositor
vds                                        Stopped Disco virtual
vmicguestinterface                         Stopped Interfaz de servicio invitado de Hyper-V
vmicheartbeat                              Stopped Servicio de latido de Hyper-V
vmickvpexchange                            Stopped Servicio de intercambio de datos de Hyper-V
vmicrdv                                    Stopped Servicio de virtualización de Escritorio remoto de Hyper-V
vmicshutdown                               Stopped Servicio de cierre de invitado de Hyper-V
vmicvmsession                              Stopped Servicio PowerShell Direct de Hyper-V
vmicvss                                    Stopped Solicitante de instantáneas de volumen de Hyper-V
VSS                                        Stopped Instantáneas de volumen
VSStandardCollectorService150              Stopped Visual Studio Standard Collector Service 150
W32Time                                    Stopped Hora de Windows
WaaSMedicSvc                               Stopped Windows Update Medic Service
WalletService                              Stopped WalletService
WarpJITSvc                                 Stopped WarpJITSvc
TieringEngineService                       Stopped Administración de capas de almacenamiento
AarSvc_541be69                             Stopped Agent Activation Runtime_541be69
perceptionsimulation                       Stopped Servicio de simulación de percepción de Windows
SensorService                              Stopped Sensor Service
DevQueryBroker                             Stopped Agente de detección en segundo plano de DevQuery
diagnosticshub.standardcollector.service   Stopped Servicio Recopilador estándar del concentrador de diagnósticos de Microsoft (R)
diagsvc                                    Stopped Diagnostic Execution Service
DmEnrollmentSvc                            Stopped Servicio de inscripción de administración de dispositivos
dmwappushservice                           Stopped Servicio de enrutamiento de mensajes de inserción del Protocolo de aplicación inalámbrica (WAP) de administración de dispositivos
dot3svc                                    Stopped Configuración automática de redes cableadas
DsmSvc                                     Stopped Administrador de configuración de dispositivos
Eaphost                                    Stopped Protocolo de autenticación extensible
EasyAntiCheat                              Stopped EasyAntiCheat
EFS                                        Stopped Sistema de cifrado de archivos (EFS)
embeddedmode                               Stopped Modo incrustado
EntAppSvc                                  Stopped Servicio de administración de aplicaciones de empresa
Fax                                        Stopped Fax
fdPHost                                    Stopped Host de proveedor de detección de función
FDResPub                                   Stopped Publicación de recurso de detección de función
fhsvc                                      Stopped File History Service
FontCache3.0.0.0                           Stopped Windows Presentation Foundation Font Cache 3.0.0.0
FrameServer                                Stopped Servicio FrameServer de la Cámara de Windows
GoogleChromeElevationService               Stopped Google Chrome Elevation Service
gpsvc                                      Stopped Cliente de directiva de grupo
GraphicsPerfSvc                            Stopped GraphicsPerfSvc
DeviceInstall                              Stopped Servicio de instalación de dispositivos
gupdate                                    Stopped Google Update Servicio (gupdate)
DeviceAssociationBrokerSvc_541be69         Stopped DeviceAssociationBroker_541be69
dbupdatem                                  Stopped Servicio de Actualización de Dropbox (dbupdatem)
AdobeFlashPlayerUpdateSvc                  Stopped Adobe Flash Player Update Service
AJRouter                                   Stopped Servicio de enrutador de AllJoyn
ALG                                        Stopped Servicio de puerta de enlace de nivel de aplicación
AntiVirMailService                         Stopped Avira Mail Protection
AntiVirWebService                          Stopped Avira Web Protection
AppIDSvc                                   Stopped Identidad de aplicación
AppReadiness                               Stopped Preparación de aplicaciones
AppXSvc                                    Stopped Servicio de implementación de AppX (AppXSVC)
autotimesvc                                Stopped Hora de la red de telefonía móvil
AxInstSV                                   Stopped Instalador de ActiveX (AxInstSV)
BcastDVRUserService_541be69                Stopped Servicio de usuario de difusión y GameDVR_541be69
BDESVC                                     Stopped Servicio Cifrado de unidad BitLocker
BITS                                       Stopped Servicio de transferencia inteligente en segundo plano (BITS)
BluetoothUserService_541be69               Stopped Servicio de soporte técnico al usuario de Bluetooth_541be69
BTAGService                                Stopped Servicio de puerta de enlace de audio de Bluetooth
bthserv                                    Stopped Servicio de compatibilidad con Bluetooth
CaptureService_541be69                     Stopped CaptureService_541be69
COMSysApp                                  Stopped Aplicación del sistema COM+
ConsentUxUserSvc_541be69                   Stopped ConsentUX_541be69
CredentialEnrollmentManagerUserSvc_541be69 Stopped CredentialEnrollmentManagerUserSvc_541be69
dbupdate                                   Stopped Servicio de Actualización de Dropbox (dbupdate)
defragsvc                                  Stopped Optimizar unidades
SensrSvc                                   Stopped Servicio de supervisión de sensores
gupdatem                                   Stopped Google Update Servicio (gupdatem)
hpqcaslwmiex                               Stopped HP CASL Framework Service
PerfHost                                   Stopped DLL de host del Contador de rendimiento
PhoneSvc                                   Stopped Servicio telefónico
pla                                        Stopped Registros y alertas de rendimiento
PNRPAutoReg                                Stopped Servicio de publicación de nombres de equipo PNRP
PNRPsvc                                    Stopped Protocolo de resolución de nombres de mismo nivel
PrintNotify                                Stopped Extensiones y notificaciones de impresora
PrintWorkflowUserSvc_541be69               Stopped PrintWorkflow_541be69
PushToInstall                              Stopped Servicio PushToInstall de Windows
QWAVE                                      Stopped Experiencia de calidad de audio y vídeo de Windows (qWave)
RasAuto                                    Stopped Administrador de conexiones automáticas de acceso remoto
RemoteAccess                               Stopped Enrutamiento y acceso remoto
RemoteRegistry                             Stopped Registro remoto
RetailDemo                                 Stopped Servicio de prueba comercial
rpcapd                                     Stopped Remote Packet Capture Protocol v.0 (experimental)
RpcLocator                                 Stopped Ubicador de llamada a procedimiento remoto (RPC)
SCardSvr                                   Stopped Tarjeta inteligente
ScDeviceEnum                               Stopped Smart Card Device Enumeration Service
SCPolicySvc                                Stopped Directiva de extracción de tarjetas inteligentes
SDRSVC                                     Stopped Windows Backup
seclogon                                   Stopped Inicio de sesión secundario
SensorDataService                          Stopped Servicio de datos del sensor
XboxGipSvc                                 Stopped Xbox Accessory Management Service
hidserv                                    Stopped Servicio de dispositivo de interfaz humana
p2psvc                                     Stopped Agrupación de red del mismo nivel
ose                                        Stopped Office  Source Engine
HvHost                                     Stopped Servicio de host HV
icssvc                                     Stopped Servicio de punto de conexión de Windows Mobile
IKEEXT                                     Stopped Módulos de creación de claves de IPsec para IKE y AuthIP
IpxlatCfgSvc                               Stopped Servicio de configuración de traslación de IP
KtmRm                                      Stopped KTMRM para DTC (Coordinador de transacciones distribuidas)
lltdsvc                                    Stopped Asignador de detección de topologías de nivel de vínculo
LxpSvc                                     Stopped Servicio de experiencia de idioma
MapsBroker                                 Stopped Administrador de mapas descargado
MessagingService_541be69                   Stopped MessagingService_541be69
MSDTC                                      Stopped Coordinador de transacciones distribuidas
MSiSCSI                                    Stopped Servicio del iniciador iSCSI de Microsoft
msiserver                                  Stopped Windows Installer
NaturalAuthentication                      Stopped Autenticación natural
NcaSvc                                     Stopped Asistente para la conectividad de red
NcdAutoSetup                               Stopped Configuración automática de dispositivos conectados a la red
Netlogon                                   Stopped Net Logon
Netman                                     Stopped Conexiones de red
NetSetupSvc                                Stopped Servicio de configuración de red
NetTcpPortSharing                          Stopped Servicio de uso compartido de puertos Net.Tcp
NgcCtnrSvc                                 Stopped Contenedor de Microsoft Passport
NgcSvc                                     Stopped Microsoft Passport
p2pimsvc                                   Stopped Administrador de identidad de redes de mismo nivel
XboxNetApiSvc                              Stopped Servicio de red de Xbox Live
```
    
#### 5. Mostrar una lista a cuatro columnas de todos los directorios que están en el raíz de la unidad  `C:`

Primero se accedio al directorio `C:` con estos comandos desde este directorio `C:\Users\mapac`.
>`cd ..`
>`cd ..`

Después se ejecuto el siguiente comando
>Get-ChildItem -Directory | fw -Column 4

Cuyo resultado es el siguiente: 
```
    Directorio: C:\
    
.Xilinx                                       AdwCleaner                                    AMD                                          dev
Games                                         intelFPGA_pro                                 masm32                                       PerfLogs
Program Files                                 Program Files (x86)                           SWSetup                                      Temp
Users    
```
    
#### 6. Cree una lista formateada de todos los archivos  `.exe`  del directorio  `C:\Windows`. Debe mostrarse el nombre, la información de versión, y el tamaño del archivo. La propiedad de tamaño se llama  `length`  en Powershell, pero para mayor claridad, la columna se debe llamar  **Tamaño**  en su listado.

Primero accedemos a la carpeta `\Windows` 
> `cd .\Windows`

Utilizamos el comando
> `Get-ChildItem -File | gm`

Esto con el fin de encontrar la propiedad de Información de versión la cual se llama `VersionInfo`

Es así como se ejecuta el siguiente comando.
>``Get-ChildItem -File | where -filter {$_.Name -like "*.exe"} | fl -Property name, @{n='tamaño';e={$_.length}}, versionInfo``

Cuyo resultado es:
```
Name        : bfsvc.exe
tamaño      : 73216
VersionInfo : File:             C:\Windows\bfsvc.exe
              InternalName:     bfsvc.exe
              OriginalFilename: bfsvc.exe.mui
              FileVersion:      10.0.18362.1 (WinBuild.160101.0800)
              FileDescription:  Utilidad de servicio de actualización del archivo de arranque
              Product:          Sistema operativo Microsoft® Windows®
              ProductVersion:   10.0.18362.1
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Español (España, internacional)


Name        : explorer.exe
tamaño      : 4622280
VersionInfo : File:             C:\Windows\explorer.exe
              InternalName:     explorer
              OriginalFilename: EXPLORER.EXE.MUI
              FileVersion:      10.0.18362.714 (WinBuild.160101.0800)
              FileDescription:  Explorador de Windows
              Product:          Sistema operativo Microsoft® Windows®
              ProductVersion:   10.0.18362.714
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Español (México)


Name        : HelpPane.exe
tamaño      : 1059840
VersionInfo : File:             C:\Windows\HelpPane.exe
              InternalName:     HelpPane.exe
              OriginalFilename: HelpPane.exe.mui
              FileVersion:      10.0.18362.714 (WinBuild.160101.0800)
              FileDescription:  Ayuda y soporte técnico de Microsoft
              Product:          Sistema operativo Microsoft® Windows®
              ProductVersion:   10.0.18362.714
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Español (México)


Name        : hh.exe
tamaño      : 18432
VersionInfo : File:             C:\Windows\hh.exe
              InternalName:     HH 1.41
              OriginalFilename: HH.exe.mui
              FileVersion:      10.0.18362.714 (WinBuild.160101.0800)
              FileDescription:  Archivo ejecutable de ayuda HTML de Microsoft®
              Product:          Ayuda de HTML
              ProductVersion:   10.0.18362.714
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Español (México)


Name        : HPCUST1.exe
tamaño      : 3322568
VersionInfo : File:             C:\Windows\HPCUST1.exe
              InternalName:     HPCUST1.exe
              OriginalFilename: HPCUST1.exe
              FileVersion:      1.0.0.1
              FileDescription:  HPCUST1
              Product:          HPCUST1
              ProductVersion:   1.0.0.1
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Inglés (Estados Unidos)


Name        : HPCUST2.exe
tamaño      : 3322384
VersionInfo : File:             C:\Windows\HPCUST2.exe
              InternalName:     HPCUST2.exe
              OriginalFilename: HPCUST2.exe
              FileVersion:      1.0.0.1
              FileDescription:  HPCUST2
              Product:          HPCUST2
              ProductVersion:   1.0.0.1
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Inglés (Estados Unidos)


Name        : InstallSupport.exe
tamaño      : 465920
VersionInfo : File:             C:\Windows\InstallSupport.exe
              InternalName:     prinst
              OriginalFilename: prinst.exe
              FileVersion:      1.00.71
              FileDescription:  INF Installer
              Product:          Samsung INF Installer
              ProductVersion:   1.00.71
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Inglés (Estados Unidos)


Name        : notepad.exe
tamaño      : 181248
VersionInfo : File:             C:\Windows\notepad.exe
              InternalName:     Notepad
              OriginalFilename: NOTEPAD.EXE.MUI
              FileVersion:      10.0.18362.1 (WinBuild.160101.0800)
              FileDescription:  Bloc de notas
              Product:          Sistema operativo Microsoft® Windows®
              ProductVersion:   10.0.18362.1
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Español (México)


Name        : prinst.exe
tamaño      : 474624
VersionInfo : File:             C:\Windows\prinst.exe
              InternalName:     prinst
              OriginalFilename: prinst.exe
              FileVersion:      1.00.72
              FileDescription:  INF Installer
              Product:          Samsung INF Installer
              ProductVersion:   1.00.72
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Inglés (Estados Unidos)


Name        : regedit.exe
tamaño      : 358400
VersionInfo : File:             C:\Windows\regedit.exe
              InternalName:     REGEDIT
              OriginalFilename: REGEDIT.EXE.MUI
              FileVersion:      10.0.18362.1 (WinBuild.160101.0800)
              FileDescription:  Editor del Registro
              Product:          Sistema operativo Microsoft® Windows®
              ProductVersion:   10.0.18362.1
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Español (España, internacional)


Name        : RtkBtManServ.exe
tamaño      : 738712
VersionInfo : File:             C:\Windows\RtkBtManServ.exe
              InternalName:
              OriginalFilename:
              FileVersion:      1.1.35.1
              FileDescription:  Realtek Bluetooth BTDevManager Service Application
              Product:          Bluetooth Software
              ProductVersion:   1.1.35.1
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Chino (simplificado, China)


Name        : SECOH-QAD.exe
tamaño      : 4608
VersionInfo : File:             C:\Windows\SECOH-QAD.exe
              InternalName:
              OriginalFilename:
              FileVersion:
              FileDescription:
              Product:
              ProductVersion:
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:


Name        : splwow64.exe
tamaño      : 132608
VersionInfo : File:             C:\Windows\splwow64.exe
              InternalName:     splwow64.exe
              OriginalFilename: splwow64.exe
              FileVersion:      10.0.18362.476 (WinBuild.160101.0800)
              FileDescription:  Print driver host for applications
              Product:          Microsoft® Windows® Operating System
              ProductVersion:   10.0.18362.476
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Inglés (Estados Unidos)


Name        : Wiainst64.exe
tamaño      : 152520
VersionInfo : File:             C:\Windows\Wiainst64.exe
              InternalName:     wiainst
              OriginalFilename: wiainst.exe
              FileVersion:      1.00.79
              FileDescription:  INF Scanner Installer
              Product:          INF Scanner Installer
              ProductVersion:   1.00.79
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Inglés (Estados Unidos)


Name        : winhlp32.exe
tamaño      : 11776
VersionInfo : File:             C:\Windows\winhlp32.exe
              InternalName:     WINHSTB
              OriginalFilename: WINHLP32.EXE.MUI
              FileVersion:      10.0.18362.714 (WinBuild.160101.0800)
              FileDescription:  Código auxiliar de Windows Winhlp32
              Product:          Sistema operativo Microsoft® Windows®
              ProductVersion:   10.0.18362.714
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Español (México)


Name        : write.exe
tamaño      : 11264
VersionInfo : File:             C:\Windows\write.exe
              InternalName:     write
              OriginalFilename: write
              FileVersion:      10.0.18362.1 (WinBuild.160101.0800)
              FileDescription:  Windows Write
              Product:          Microsoft® Windows® Operating System
              ProductVersion:   10.0.18362.1
              Debug:            False
              Patched:          False
              PreRelease:       False
              PrivateBuild:     False
              SpecialBuild:     False
              Language:         Inglés (Estados Unidos)

```
#### 7. Importe el módulo  `NetAdapter`  (empleando el comando  `Import-Module NetAdapter`). Empleando el cmdlet  `Get-NetAdapter`, muestre una lista de adaptadores no virtuales (adaptadores cuya propiedad Virtual sea falsa. El valor lógico falso es representado por Powershell como  `$False`).

Primero se importa el modulo
> Import-Module NetAdapter

Como ya sabemos que la propiedad es `Virtual `
Se ejecuta el siguiente comando:
> Get-NetAdapter | Where -filter {$_.Virtual -eq $false} |ft

Cuyo resultado es el siguiente: 
```
Name                      InterfaceDescription                    ifIndex Status       MacAddress             LinkSpeed
----                      --------------------                    ------- ------       ----------             ---------
Ethernet                  Realtek PCIe GBE Family Controller            9 Disconnected AC-E2-D3-66-4C-F1          0 bps
Wi-Fi                     Realtek RTL8723DE 802.11b/g/n PCIe A...       4 Up           40-9F-38-DB-E1-D1       150 Mbps
```
#### 8.  Importe el módulo  `DnsClient`. Empleando el cmdlet  `Get-DnsClientCache`, muestre una lista de los registros  `A`  y  `AAAA`  que estén en el caché. Sugerencia: Si el caché está vacío, visite algunos sitios web para poblarlo.
El comando que se utilizo fue:
> Get-DnsClientCache | where -filter {$_.Type -eq (1) -or $_.Type -eq (28)} | ft

De esa manera se obtuvo el siguiente resultado: 
```
Entry                     RecordName                Record Status    Section TimeTo Data   Data
                                                    Type                     Live   Length
-----                     ----------                ------ ------    ------- ------ ------ ----
crl3.digicert.com         cs9.wac.phicdn.net        A      Success   Answer     930      4 72.21.91.29
www.youtube.com           youtube-ui.l.google.com   A      Success   Answer      26      4 216.58.222.238
www.youtube.com           youtube-ui.l.google.com   A      Success   Answer      26      4 172.217.28.110
www.youtube.com           youtube-ui.l.google.com   A      Success   Answer      26      4 172.217.30.206
www.youtube.com           youtube-ui.l.google.com   A      Success   Answer      26      4 172.217.172.14
dl2.tlrepo.com            dl2.tlrepo.com            A      Success   Answer      87      4 5.9.78.187
i.ytimg.com               i.ytimg.com               A      Success   Answer      24      4 172.217.30.214
rtb7.adscience.nl         adp5.prolocation.net      A      Success   Answer    6389      4 94.228.133.235
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.165
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.166
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.169
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.183
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.184
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.167
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.181
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.164
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.182
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.180
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.185
d5p.de17a.com             d5p.de17a.com             A      Success   Answer   22589      4 213.155.156.168
ssl.gstatic.com           ssl.gstatic.com           A      Success   Answer      24      4 172.217.172.3
www.google.com            www.google.com            A      Success   Answer      24      4 172.217.30.196
files.minecraftforge.net  files.minecraftforge.net  A      Success   Answer      33      4 142.44.226.189
stream.toggl.com          stream.toggl.com          A      Success   Answer    1040      4 35.244.178.179
data.chocolateminecraf... data.chocolateminecraf... A      Success   Answer   11008      4 37.187.176.202
securepubads.g.doublec... partnerad.l.doubleclic... A      Success   Answer      27      4 216.58.222.194
array509.prod.do.dsp.m... array509.prod.do.dsp.m... A      Success   Answer    1864      4 20.186.48.46
r1---sn-ja5gvjv-javle.... r1.sn-ja5gvjv-javle.go... A      Success   Answer     222      4 181.49.186.204
array507.prod.do.dsp.m... array507.prod.do.dsp.m... A      Success   Answer     734      4 40.79.67.176
prg.smartadserver.com     tmk.smartadserver.com     A      Success   Answer       6      4 199.187.193.1
prg.smartadserver.com     tmk.smartadserver.com     A      Success   Answer       6      4 199.187.193.164
prg.smartadserver.com     tmk.smartadserver.com     A      Success   Answer       6      4 199.187.193.165
prg.smartadserver.com     tmk.smartadserver.com     A      Success   Answer       6      4 199.187.193.19
prg.smartadserver.com     tmk.smartadserver.com     A      Success   Answer       6      4 199.187.193.130
prg.smartadserver.com     tmk.smartadserver.com     A      Success   Answer       6      4 199.187.193.140
array508.prod.do.dsp.m... array508.prod.do.dsp.m... A      Success   Answer     640      4 40.79.65.78
googleads.g.doubleclic... pagead46.l.doubleclick... A      Success   Answer      24      4 172.217.30.194
clients4.google.com       clients.l.google.com      A      Success   Answer      25      4 172.217.172.14
fastlane.rubiconprojec... perf-optimized-by.rubi... A      Success   Answer      34      4 8.43.72.32
fastlane.rubiconprojec... perf-optimized-by.rubi... A      Success   Answer      34      4 8.43.72.113
fastlane.rubiconprojec... perf-optimized-by.rubi... A      Success   Answer      34      4 8.43.72.42
fastlane.rubiconprojec... perf-optimized-by.rubi... A      Success   Answer      34      4 8.43.72.41
fastlane.rubiconprojec... perf-optimized-by.rubi... A      Success   Answer      34      4 8.43.72.43
fastlane.rubiconprojec... perf-optimized-by.rubi... A      Success   Answer      34      4 8.43.72.52
fastlane.rubiconprojec... perf-optimized-by.rubi... A      Success   Answer      34      4 8.43.72.62
github.githubassets.com   github.githubassets.com   A      Success   Answer     939      4 185.199.108.154
github.githubassets.com   github.githubassets.com   A      Success   Answer     939      4 185.199.110.154
github.githubassets.com   github.githubassets.com   A      Success   Answer     939      4 185.199.111.154
github.githubassets.com   github.githubassets.com   A      Success   Answer     939      4 185.199.109.154
r3---sn-ja5gvjv-javle.... r3.sn-ja5gvjv-javle.go... A      Success   Answer     344      4 181.49.186.206
snigel-d.openx.net        snigel-d.openx.net        A      Success   Answer     263      4 35.244.186.129
```
#### 9. Genere una lista de todos los archivos  `.exe`  del directorio  `C:\Windows\System32`  que tengan más de 5 MB.

Primero ingresamos al directorio, dado que en este momento nos encontrabamos en el directorio  `C:\Windows`
> `cd .\System32`

De esta manera utilizamos el comando:
> `Get-ChildItem -File | where -filter {$_.Name -like "*.exe"} | where -filter {$_.Length/1MB -gt 5}| ft`

Cuyo resultado es:
 
```
    Directorio: C:\Windows\System32



Name           : MRT.exe
Length         : 121542864
CreationTime   : 14/08/2018 10:22:13 a. m.
LastWriteTime  : 10/03/2020 4:55:52 p. m.
LastAccessTime : 10/03/2020 4:55:52 p. m.
Mode           : -a----
LinkType       :
Target         : {}
VersionInfo    : File:             C:\Windows\System32\MRT.exe
                 InternalName:     mrt.exe
                 OriginalFilename: mrt.exe
                 FileVersion:      5.81.16832.1
                 FileDescription:  Herramienta de eliminación de software malintencionado de Microsoft Windows
                 Product:          Herramienta de eliminación de software malintencionado de Microsoft Windows
                 ProductVersion:   5.81.16832.1
                 Debug:            False
                 Patched:          False
                 PreRelease:       False
                 PrivateBuild:     False
                 SpecialBuild:     False
                 Language:         Español (España, internacional)


Name           : ntoskrnl.exe
Length         : 9930552
CreationTime   : 13/03/2020 5:33:19 p. m.
LastWriteTime  : 13/03/2020 5:33:19 p. m.
LastAccessTime : 13/03/2020 5:33:19 p. m.
Mode           : -a----
LinkType       : HardLink
Target         : {C:\Windows\WinSxS\amd64_microsoft-windows-os-kernel_31bf3856ad364e35_10.0.18362.720_none_c21908ac45b11b74\ntoskrnl.exe}
VersionInfo    : File:             C:\Windows\System32\ntoskrnl.exe
                 InternalName:     ntkrnlmp.exe
                 OriginalFilename: ntkrnlmp.exe
                 FileVersion:      10.0.18362.720 (WinBuild.160101.0800)
                 FileDescription:  NT Kernel & System
                 Product:          Microsoft® Windows® Operating System
                 ProductVersion:   10.0.18362.720
                 Debug:            False
                 Patched:          False
                 PreRelease:       False
                 PrivateBuild:     False
                 SpecialBuild:     False
                 Language:         Inglés (Estados Unidos)


Name           : VsGraphicsDesktopEngine.exe
Length         : 5729280
CreationTime   : 3/10/2019 11:05:02 p. m.
LastWriteTime  : 3/10/2019 11:05:33 p. m.
LastAccessTime : 3/10/2019 11:05:33 p. m.
Mode           : -a----
LinkType       : HardLink
Target         : {C:\Windows\WinSxS\amd64_microsoft-windows-d..phics-tools-desktop_31bf3856ad364e35_10.0.18362.1_none_245e3cec0b897590\VsGraphicsDesktopEngine.exe}
VersionInfo    : File:             C:\Windows\System32\VsGraphicsDesktopEngine.exe
                 InternalName:     VsGraphicsDesktopEngine.exe
                 OriginalFilename: VsGraphicsDesktopEngine.exe
                 FileVersion:      10.0.18362.1 (WinBuild.160101.0800)
                 FileDescription:  VsGraphics Desktop Engine
                 Product:          Microsoft® Windows® Operating System
                 ProductVersion:   10.0.18362.1
                 Debug:            False
                 Patched:          False
                 PreRelease:       False
                 PrivateBuild:     False
                 SpecialBuild:     False
                 Language:         Inglés (Estados Unidos)


```
   
#### 10.  Muestre una lista de parches que sean actualizaciones de seguridad.

Para resolver este punto se utilizo el siguiente comando:
> `Get-HotFix | where -filter {$_.Description -like "Security*"} | ft`

Cuyo resultado fue: 
```
Source        Description      HotFixID      InstalledBy          InstalledOn
------        -----------      --------      -----------          -----------
PCUBILLOS     Security Update  KB4515383     NT AUTHORITY\SYSTEM  18/09/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4516115     NT AUTHORITY\SYSTEM  20/09/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4521863     NT AUTHORITY\SYSTEM  9/10/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4524244     NT AUTHORITY\SYSTEM  15/02/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4524569     NT AUTHORITY\SYSTEM  15/11/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4528759     NT AUTHORITY\SYSTEM  17/01/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4537759     NT AUTHORITY\SYSTEM  14/02/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4538674     NT AUTHORITY\SYSTEM  13/02/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4541338     NT AUTHORITY\SYSTEM  13/03/2020 12:00:00 a. m.

```
#### 11. Muestre una lista de parches que hayan sido instalados por el usuario  `Administrador`, que sean actualizaciones. Si no tiene ninguno, busque parches instalados por el usuario  `System`. Note que algunos parches no tienen valor en el campo  `Installed By`.

El comando que se utilizo fue:
>`Get-HotFix| where -filter {$_.InstalledBy -like "*SYSTEM*"} | ft -AutoSize -Wrap`

Cuyo resultado fue:
```
Source    Description     HotFixID  InstalledBy         InstalledOn
------    -----------     --------  -----------         -----------
PCUBILLOS Update          KB4537572 NT AUTHORITY\SYSTEM 9/03/2020 12:00:00 a. m.
PCUBILLOS Security Update KB4515383 NT AUTHORITY\SYSTEM 18/09/2019 12:00:00 a. m.
PCUBILLOS Security Update KB4516115 NT AUTHORITY\SYSTEM 20/09/2019 12:00:00 a. m.
PCUBILLOS Security Update KB4521863 NT AUTHORITY\SYSTEM 9/10/2019 12:00:00 a. m.
PCUBILLOS Security Update KB4524244 NT AUTHORITY\SYSTEM 15/02/2020 12:00:00 a. m.
PCUBILLOS Security Update KB4524569 NT AUTHORITY\SYSTEM 15/11/2019 12:00:00 a. m.
PCUBILLOS Security Update KB4528759 NT AUTHORITY\SYSTEM 17/01/2020 12:00:00 a. m.
PCUBILLOS Security Update KB4537759 NT AUTHORITY\SYSTEM 14/02/2020 12:00:00 a. m.
PCUBILLOS Security Update KB4538674 NT AUTHORITY\SYSTEM 13/02/2020 12:00:00 a. m.
PCUBILLOS Security Update KB4541338 NT AUTHORITY\SYSTEM 13/03/2020 12:00:00 a. m.
PCUBILLOS Update          KB4551762 NT AUTHORITY\SYSTEM 13/03/2020 12:00:00 a. m.
```    
   
#### 12.  Genere una lista de todos los procesos que estén corriendo con el nombre  **Conhost**  o  **Svchost**.

El comando que se utilizo fue:
> `Get-Process | where -filter {$_.Name -eq "Conhost" -or $_.Name -eq "Svchost"} | ft -AutoSize -Wrap`

Cuyo resultado fue: 
```
Handles NPM(K)  PM(K)  WS(K) CPU(s)    Id SI ProcessName
------- ------  -----  ----- ------    -- -- -----------
    153     10   6752   7072         5304  0 conhost
   1337     27  13720  32156           84  0 svchost
     86      5    972   3728          500  0 svchost
    189     11   2084   7556          652  0 svchost
    159     11   2212   8208          920  0 svchost
    586     34  11212  21424          988  0 svchost
   1420     22   8552  15796         1100  0 svchost
    342     12   2912  10052         1148  0 svchost
    231     13   2936   9908         1196  0 svchost
    427     17   4348  51076         1208  0 svchost
    285     11   2568   8420         1340  0 svchost
    420     18   6568  15220         1448  0 svchost
    390     18   5564  15184         1472  0 svchost
    224     11   2144   8644         1508  0 svchost
    228     14  15528  12080         1556  0 svchost
    262     13   2580  10240         1564  0 svchost
    323     10   2244   7944         1640  0 svchost
    144     13   1704   5740         1664  0 svchost
    320     12   2872   9980         1716  0 svchost
    165      7   1572   5684         1816  0 svchost
    157     10   2104  11632         1840  0 svchost
    446     14  15324  14944         1848  0 svchost
    152     28   5244   6436         1856  0 svchost
    124      8   1500   6612         2060  0 svchost
    258     10   2860   7436         2236  0 svchost
    160     10   2204   8804         2244  0 svchost
    221     14   2244   8280         2252  0 svchost
    207     10   6700  14932         2260  0 svchost
    389     17   5416  11976         2492  0 svchost
    303     14   3764   8428         2508  0 svchost
    236     15 113820 113772         2632  0 svchost
    173      9   1976   7152         2640  0 svchost
    225      7   1316   5504         2652  0 svchost
    521     12   3268   8800         2664  0 svchost
    130      9   1716   7304         2784  0 svchost
    224     14   2236   9168         2800  0 svchost
    190      9   1828   7632         2856  0 svchost
    155     10   1884   7336         2864  0 svchost
    138     14   1912   6232         3120  0 svchost
    377     18   3344   9816         3128  0 svchost
    189     10   2200   7224         3212  0 svchost
    505     23   6544  17432         3292  0 svchost
    275     17   2732  13668         3328  0 svchost
    433     33  14676  17828         3440  0 svchost
    399     18   6996  15892         3848  0 svchost
    380     26   4296  13632         3884  0 svchost
    610     25  15140  31452         3904  0 svchost
    397     23  32340  39404         3924  0 svchost
    199      8   2052   6496         3940  0 svchost
    294     15   4088  18568         3964  0 svchost
    263     13   2636   7212         4076  0 svchost
    208     11   2164   6272         4156  0 svchost
    185     10   2008   7200         4184  0 svchost
    144      7   1292   5272         4248  0 svchost
    135      8   1636   5600         4260  0 svchost
    414     20   4904  20616         4336  0 svchost
    478     18   3624  11080         4572  0 svchost
    210     12   2376   8640         4636  0 svchost
    132      9   1640   5764         4776  0 svchost
    355     24   2948   7832         4980  0 svchost
    292     14   3904  14968         5588  0 svchost
    406     27   3624  12120         5792  0 svchost
    164     10   1824   6392         5884  0 svchost
    174     27   1944   7268         6004  0 svchost
    387     16   3664  15328         6336  0 svchost
    417     22   5296  18380         6628  0 svchost
    241     13   2928  11552         7060  0 svchost
    535     72  18332  28300         7160  0 svchost
    370     18   4492  24196   1,27  7420  1 svchost
    544     24   9488  36084   7,80  7772  1 svchost
    501     21  11236  31496   9,83  7932  1 svchost
    189     10   1900   8856         8152  0 svchost
    284     15   3916  19680         8352  0 svchost
    469     26   5608  18768   1,36  8532  1 svchost
    170      9   1812   7360         8888  0 svchost
    246     11   3964   7892         9016  0 svchost
    185    248   3104   6496         9364  0 svchost
    115      7   1364   4860         9408  0 svchost
    289     15   5808  15568        10584  0 svchost
    187     11   2352   9052        10936  0 svchost
    225     13   2844  11360        11332  0 svchost
    184     10   2428  11140        11744  0 svchost
    246     16   6772  10176        12548  0 svchost
    145      8   3540   8972        13252  0 svchost
    237     13   3156  11724        13856  0 svchost
    122      8   1476   5768        14100  0 svchost
```
