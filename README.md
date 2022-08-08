# JavaHW0805

# Get All Order
http://localhost:8080/order

# Get Order Id
http://localhost:8080/order/1

# Create Order
http://localhost:8080/order

# Update Order
http://localhost:8080/order/1

# Delete Order
http://localhost:8080/order/1

## 請先 call Create Order 用以下 Json 去新增一筆餐點為：
1. 
```=json
{
    "seq": 1,
    "totalPrice": 2500,
    "waiter": "Bill",
    "mealList": [
        {
            "name": "salmon",
            "price": 2500,
            "description": "seaFood 感恩seaFood、讚嘆seaFood"
        }
    ]
}
```

2. 測試 Get All Order api 與 Get Order Id api

3. 測試 Update Order api

4. 測試 Delete Order api
