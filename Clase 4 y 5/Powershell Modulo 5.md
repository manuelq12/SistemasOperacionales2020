# Powershell Modulo 4 y 5
> **Realizado por Manuel Quintero**
## Modulo 5

#### 1.  ¿Cuál clase puede emplearse para consultar la dirección IP de un adaptador de red? ¿Posee dicha clase algún método para liberar un préstamo de dirección (lease) DHCP?

La clase para poder consultar la dirección IP de un adaptador de red es win32_NetworkAdapterconfiguration. Según la documentación de Microsoft existe el método `RenewDHCPLease()` el cual renueva la dirección de un adaptador de red con DHCP habilitado. 

> [Docs Microsoft] (https://docs.microsoft.com/en-us/windows/win32/cimwin32prov/renewdhcplease-method-in-class-win32-networkadapterconfiguration/).

El comando para hallar la IP de un adaptador de red fue

>`Get-CimInstance win32_networkadapterconfiguration | Select-Object IP`

Cuyo resultado fue: 
```
Description             : Microsoft Kernel Debug Network Adapter
Index                   : 0
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : VMware Virtual Ethernet Adapter for VMnet1
Index                   : 1
IPAddress               : {192.168.220.1, fe80::54:4133:622b:ae96}
IPConnectionMetric      : 35
IPEnabled               : True
IPFilterSecurityEnabled : False

Description             : VMware Virtual Ethernet Adapter for VMnet8
Index                   : 2
IPAddress               : {192.168.117.1, fe80::38b6:84d4:3b1d:5f2f}
IPConnectionMetric      : 35
IPEnabled               : True
IPFilterSecurityEnabled : False

Description             : Realtek PCIe GBE Family Controller
Index                   : 3
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : Realtek RTL8723DE 802.11b/g/n PCIe Adapter
Index                   : 4
IPAddress               : {192.168.0.12, fe80::95ec:b62c:d486:60db}
IPConnectionMetric      : 50
IPEnabled               : True
IPFilterSecurityEnabled : False

Description             : Microsoft Wi-Fi Direct Virtual Adapter
Index                   : 5
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : Microsoft Wi-Fi Direct Virtual Adapter
Index                   : 6
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : WAN Miniport (SSTP)
Index                   : 7
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : WAN Miniport (IKEv2)
Index                   : 8
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : WAN Miniport (L2TP)
Index                   : 9
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : WAN Miniport (PPTP)
Index                   : 10
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : WAN Miniport (PPPOE)
Index                   : 11
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : WAN Miniport (IP)
Index                   : 12
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : WAN Miniport (IPv6)
Index                   : 13
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : WAN Miniport (Network Monitor)
Index                   : 14
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : Bluetooth Device (Personal Area Network)
Index                   : 15
IPAddress               :
IPConnectionMetric      :
IPEnabled               : False
IPFilterSecurityEnabled :

Description             : VirtualBox Host-Only Ethernet Adapter
Index                   : 16
IPAddress               : {192.168.56.1, fe80::20df:d36b:7958:bb89}
IPConnectionMetric      : 25
IPEnabled               : True
IPFilterSecurityEnabled : False

Description             : VirtualBox Host-Only Ethernet Adapter #2
Index                   : 17
IPAddress               : {192.168.99.1, fe80::f4ab:c068:2e39:c645}
IPConnectionMetric      : 25
IPEnabled               : True
IPFilterSecurityEnabled : False 
```

#### 2.  Despliegue una lista de parches empleando WMI (Microsoft se refiere a los parches con el nombre  **quick-fix engineering**). Es diferente el listado al que produce el cmdlet  `Get-Hotfix`?

Primero realizamos el comando:
>`Get-WmiObject win32_quickfixengineering`

Cuyo resultado fue: 
```
Source        Description      HotFixID      InstalledBy          InstalledOn
------        -----------      --------      -----------          -----------
PCUBILLOS     Update           KB4537572     NT AUTHORITY\SYSTEM  9/03/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4515383     NT AUTHORITY\SYSTEM  18/09/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4516115     NT AUTHORITY\SYSTEM  20/09/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4521863     NT AUTHORITY\SYSTEM  9/10/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4524244     NT AUTHORITY\SYSTEM  15/02/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4524569     NT AUTHORITY\SYSTEM  15/11/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4528759     NT AUTHORITY\SYSTEM  17/01/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4537759     NT AUTHORITY\SYSTEM  14/02/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4538674     NT AUTHORITY\SYSTEM  13/02/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4541338     NT AUTHORITY\SYSTEM  13/03/2020 12:00:00 a. m.
PCUBILLOS     Update           KB4551762     NT AUTHORITY\SYSTEM  13/03/2020 12:00:00 a. m.
```

Más adelante usamos el comando: 
> `Get-HotFix`

Cuyo resultado fue: 
```
Source        Description      HotFixID      InstalledBy          InstalledOn
------        -----------      --------      -----------          -----------
PCUBILLOS     Update           KB4537572     NT AUTHORITY\SYSTEM  9/03/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4515383     NT AUTHORITY\SYSTEM  18/09/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4516115     NT AUTHORITY\SYSTEM  20/09/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4521863     NT AUTHORITY\SYSTEM  9/10/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4524244     NT AUTHORITY\SYSTEM  15/02/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4524569     NT AUTHORITY\SYSTEM  15/11/2019 12:00:00 a. m.
PCUBILLOS     Security Update  KB4528759     NT AUTHORITY\SYSTEM  17/01/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4537759     NT AUTHORITY\SYSTEM  14/02/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4538674     NT AUTHORITY\SYSTEM  13/02/2020 12:00:00 a. m.
PCUBILLOS     Security Update  KB4541338     NT AUTHORITY\SYSTEM  13/03/2020 12:00:00 a. m.
PCUBILLOS     Update           KB4551762     NT AUTHORITY\SYSTEM  13/03/2020 12:00:00 a. m.
```
Ambos resultados son iguales.


#### 3.  Empleando WMI, muestre una lista de servicios, que incluya su status actual, su modalidad de inicio, y las cuentas que emplean para hacer login.
La clase WMI que usaremos se llama `win32_service`
Utlizando el siguiente comando: 
>`Get-WmiObject win32_service | GM`

Buscamos el nombre de las propiedades que desplegaremos. En este caso son `Status, StartMode,SystemName` 

El comando utilizado fue
>`Get-WmiObject win32_service | Select-Object status, startmode, systemname`

Cuyo resultado fue: 
```
status startmode systemname
------ --------- ----------
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
UNK... Unknown   PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
UNK... Unknown   PCUBILLOS
OK     Disabled  PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Disabled  PCUBILLOS
OK     Disabled  PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Disabled  PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Disabled  PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Manual    PCUBILLOS
OK     Auto      PCUBILLOS
```
#### 4.  Empleando cmdlets de CIM, liste todas las clases del namespace  `SecurityCenter2`, que tengan  **product**  como parte del nombre.
Para esto se utilizo el siguiente comando:
 > `Get-CimClass -Namespace root/SecurityCenter2 | where -filter {$_.CimClassName -like "*Product*"}`

Cuyo resultado fue: 

```
   NameSpace: ROOT/SecurityCenter2

CimClassName                        CimClassMethods      CimClassProperties
------------                        ---------------      ------------------
AntiSpywareProduct                  {}                   {displayName, instanceGuid, pathToSignedProductExe, pathToSignedReportingExe...}
AntiVirusProduct                    {}                   {displayName, instanceGuid, pathToSignedProductExe, pathToSignedReportingExe...}
FirewallProduct                     {}                   {displayName, instanceGuid, pathToSignedProductExe, pathToSignedReportingExe...}
```

#### 5.  Empleando cmdlets de CIM, y los resultados del ejercicio anterior, muestre los nombres de las aplicaciones antispyware instaladas en el sistema. También puede consultar si hay productos antivirus instalados en el sistema.

Para mostrar los nombres de las aplicaciones antispyware instaladas se utilizo el siguiente comando: 
> `Get-CimInstance -Namespace root/SecurityCenter2 -ClassName AntiSpywareProduct | Select-Object displayName`

Cuyo resultado fue: 
```
displayName
-----------
Avira Antivirus
Windows Defender
```

Para el los nombres de antivirus instalados  se utilizo el siguiente comando:

> `Get-CimInstance -Namespace root/SecurityCenter2 -ClassName AntiVirusProduct | Select-Object displayName`

Cuyo resultado fue: 
```
displayName
-----------
Avira Antivirus
Windows Defender
```
