import React, { Component } from 'react';

function Post({ title, body }) {
  return (
    <div style={{ margin: '20px 0', padding: '10px', border: '1px solid #ccc' }}>
      <h3>{title}</h3>
      <p>{body}</p>
    </div>
  );
}


class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => this.setState({ posts: data }))
      .catch(error => {
        console.error('Fetch error:', error);
        this.setState({ hasError: true });
      });
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("Something went wrong while rendering Posts.");
    console.error("Caught error:", error, info);
    this.setState({ hasError: true });
  }

  render() {
    if (this.state.hasError) {
      return <h2>Something went wrong. Try reloading the page.</h2>;
    }

    return (
      <div>
        <h2>Blog Posts</h2>
        {this.state.posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
