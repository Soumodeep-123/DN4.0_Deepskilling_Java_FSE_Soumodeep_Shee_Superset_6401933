// OnlineShopping.js - OnlineShopping class component
import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
    constructor(props) {
        super(props);
        
        // Array of Cart items - 5 items initialized
        this.cartItems = [
            { itemname: "Laptop", price: 999.99 },
            { itemname: "Smartphone", price: 599.99 },
            { itemname: "Headphones", price: 199.99 },
            { itemname: "Keyboard", price: 79.99 },
            { itemname: "Mouse", price: 39.99 }
        ];
    }

    render() {
        return (
            <div>
                <h1>Online Shopping Cart</h1>
                <div>
                    {/* Loop through cart items and display data */}
                    {this.cartItems.map((item, index) => (
                        <Cart 
                            key={index}
                            itemname={item.itemname}
                            price={item.price}
                        />
                    ))}
                </div>
                <div>
                    Total Items: {this.cartItems.length}
                </div>
            </div>
        );
    }
}

export default OnlineShopping;
