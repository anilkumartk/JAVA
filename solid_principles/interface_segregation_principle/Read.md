The principle states that the larger interfaces split into smaller ones. Because the implementation
classes use only the methods that are required. We should not force the client to use the methods
that they do not want to use.


Eg:
1. UPIpayments interface has send, receive and creditbalance cash back.
2. But Phone pay and paytm didn't use creditbalance, but it should implement from upipayments interface.
3. So we split/move it into another interface to obey the principle. 