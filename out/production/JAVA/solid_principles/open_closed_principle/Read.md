The open-closed principle states that according to new requirements the module should be
open for extension but closed for modification.

Eg:
1. In Notification Service we want to add new features, then we need to modify the notification
service class.It violates the open-closed principle.
2. So we make notifications as interface, now if we want to add new notification then we should
 implements the notifications interface.