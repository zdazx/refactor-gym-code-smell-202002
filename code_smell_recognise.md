| 编号 | 坏味道名称       | 腐烂点                                                       |
| ---- | ---------------- | ------------------------------------------------------------ |
| $1   | 纯数据类         | CartItem类                                                   |
| $2   | 重复的switch     | `Employee.payAmount()、CheckInSystem.checkIn()方法`          |
| $3   | 过长的函数       | `customer.statement()`                                       |
|      | 神秘命名         | `customer.statement()`中的数字                               |
|      | 注释             | `customer.statement()`                                       |
|      | 依恋情结         | `Customer.statement()与Rental中方法交流频繁`                 |
| $4   | 霰弹式修改       | `transfer.transfer()中if判断条件`                            |
| $5   | 循环语句         | `collectionCalculate.filterEvenNumber()`                     |
| $6   | 被拒绝的遗赠     | 抽象类Animal中包含了一些子类用不到的方法                     |
| $7   | 过长的参数列表   | too_many_params的User类                                      |
| $8   | 依恋情结         | `ConfigSetting类与Application类的数据交流格外频繁`           |
| $9   | 冗赘的元素       | RoomType类、RoomChecker类是冗赘的                            |
| $10  | 过长的方法       | `orderReceipt.printReceipt()`                                |
|      | 注释             | `orderReceipt.printReceipt()`                                |
| $11  | 夸夸其谈的通用性 | Baby类中的方法                                               |
| $12  | 死代码           | `order类中的totalPrice()方法`<br>`lineItem.getDescription()` |
| $13  | 神秘命名         | `User类中的ad变量`                                           |
|      | 注释             | `User类中的注释`                                             |
| $14  | 临时字段         | `StorageManager类中的productBatchesToExpired变量`            |
| $15  | 可变的数据       | `ShoppingCart类中的filed`                                    |
| $16  | 数据泥团         | `Order类中的buyerName、buyerPhoneNumber、buyerAddress字段`   |
| $17  | 中间人           | `person类中有一半函数都委托给了Department类`                 |
| $18  | 重复代码         | `AirwayBill.to()`<br>`AirwayBill.from()`<br>`Receipt.getReceiptString()`<br>`Print.printString()`<br>`Print.printTwoStrings()`<br>`Print.printStringAndInt()` |
| $19  | 过大的类         | `Poker类`                                                    |
|      | 过长的方法       | `Poker.compairResult()`                                      |
| $20  | 基本类型偏执     | `DeliveryManager类的toAdress、fromAdress字段`                |
| $21  | 过长的消息链     | `DiseaseControlCenter.hasPatient()`                          |
| $22  | 内幕交易         | `Motorist、License类之间存在大量的数据互相访问或交换`        |
| $23  | 异曲同工的类     | `IPChecker、IPValidator类异曲同工`                           |
| $24  | 发散式变化       | `Account.toXml()、 Account.toText()方法`                     |

