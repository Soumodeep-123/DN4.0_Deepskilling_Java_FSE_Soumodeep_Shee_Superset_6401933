// Cart.js - Cart class component
import React, { Component } from 'react';

class Cart extends Component {
    constructor(props) {
        super(props);
        // Properties for Cart
        this.itemname = props.itemname;
        this.price = props.price;
    }

    render() {
        return (
            <div>
                <h3>Item: {this.props.itemname}</h3>
                <p>Price: ${this.props.price}</p>
            </div>
        );
    }
}

export default Cart;
