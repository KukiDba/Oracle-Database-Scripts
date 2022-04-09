This is first sample file


GES(Maintain the lock across the data block in all instance).
a.LMON
************
LMON  Global Enqueue Service Monitor    (Lock monitor)
The LMON monitors the entire cluster to manage the global enqueues and the resources and performs global enqueue recovery operations.
LMON manages instance and process failures and the associated recovery for the Global Cache Service (GCS) and Global Enqueue Service (GES).
In particular, LMON handles the part of recovery associated with global resources.
LMON provided services are also known as cluster group services (CGS).
Lock monitor manages global locks and resources. It handles the redistribution of instance locks whenever instances are started or shutdown.
Lock monitor also recovers instance lock information prior to the instance recovery process.
Lock monitor co-ordinates with the Process Monitor (PMON) to recover dead processes that hold instance locks.


b.LMD
**************
LMDx  Global Enqueue Service Daemon
The LMD is the lock agent process that manages enqueue manager service requests for Global Cache Service enqueues to control access to global enqueues and resources. This process manages incoming remote resource requests within each instance.
The LMD process also handles deadlock detection and remote enqueue requests.
Remote resource requests are the requests originating from another instance.
LMDn processes manage instance locks that are used to share resources between instances.
LMDn processes also handle deadlock detection and remote lock requests.



RE-mastering

RE-configuation

after node evication
