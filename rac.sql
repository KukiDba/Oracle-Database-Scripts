srvtl add database instance -d db-name
srvctl sqlplus dba

LMS is most very active background processes.
Consuming significant amount of CPU time. ( 10g R2 – ensure that LMS process does not encounter the CPU starvation).
Its primary job is to transport blocks across the nodes for cache-fusion requests.
If there is a consistent-read request, the LMS process rolls back the block, makes a Consistent-Read image of the block and then ship this block across the HSI (High Speed Interconnect) to the process requesting from a remote node.
LMS must also check constantly with the LMD background process (or our GES process) to get the lock requests placed by the LMD process.
Each node have 2 or more LMS processes.
GCS_SERVER_PROCESSES –> no of LMS processes specified in init. ora parameter.
Above parameter value set based on number of cpu’s ( MIN(CPU_COUNT/2,2))
10gR2, single CPU instance,only one LMS processes started.
Increasing the parameter value,if global cache activity is very high.
Also called the GCS (Global Cache Services) processes.

