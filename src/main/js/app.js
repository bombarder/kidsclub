'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {customers: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/customers'}).done(response => {
            this.setState({customers: response.entity._embedded.customers});
        });
    }

    render() {
        return (
            <CustomerList customers={this.state.customers}/>
        )
    }
}
// end::app[]

// tag::customer-list[]
class CustomerList extends React.Component{
    render() {
        var customers = this.props.customers.map(customer =>
            <Customer key={customer._links.self.href} customer={customer}/>
        );
        return (
            <table>
                <tbody>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>login</th>
                </tr>
                {customers}
                </tbody>
            </table>
        )
    }
}
// end::customer-list[]

// tag::customer[]
class Customer extends React.Component{
    render() {
        return (
            <tr>
                <td>{this.props.customer.firstName}</td>
                <td>{this.props.customer.lastName}</td>
                <td>{this.props.customer.login}</td>
            </tr>
        )
    }
}
// end::customer[]

// tag::render[]
ReactDOM.render(
    <App />,
    document.getElementById('react')
)
// end::render[]
