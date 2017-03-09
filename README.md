# fileio

|                Task                         |    Elapsed   |
|---------------------------------------------|--------------|
|Copy the file one byte at a time             | 4.601136 sec |
|Copy the file using a byte array of size 1KB | 0.004529 sec |
|Copy the file using a byte array of size 4KB | 0.001604 sec |
|Copy the file using a byte array of size 64KB| 0.001028 sec
|Copy the file using BufferedReader and PrintWriter to copy lines of Text | 0.069082 sec |

## Explantion

From the result table we will found copy the file `one byte at a time` consume the longest time because it can read only one byte per time and convert to ASCII character and finally it just only write one byte per time.
