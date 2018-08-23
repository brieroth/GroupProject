<template>
  <div id="footer" slot="page-bottom" >
    <div class="push"></div>
    <footer class="page-footer font-small blue">
              <div class="container">
          <div class="row py-4 d-flex">
             <div class="col-md-6 col-lg-7 text-center text-md-right">
              <a class="fb-ic">
                <i class="fa fa-facebook white-text mr-4"> </i>
              </a>
              <a class="tw-ic">
                <i class="fa fa-twitter white-text mr-4"> </i>
              </a>
              <a class="gplus-ic">
                <i class="fa fa-google-plus white-text mr-4"> </i>
              </a>
              <a class="li-ic">
                <i class="fa fa-linkedin white-text mr-4"> </i>
              </a>
              <a class="ins-ic">
                <i class="fa fa-instagram white-text"> </i>
              </a>
            </div>
          </div>
        </div>
         <div class="footer-copyright text-center py-3">
        <p><router-link to="/aboutUs"><a href="#">About Us</a></router-link></p>
        <p><router-link to="/opening"><a href="#">Find Us </a></router-link></p>
        <router-link to="/"><a href="https://mdbootstrap.com/bootstrap-tutorial/"> QACinema.com</a></router-link>
        © 2018 Copyright
          </div>
    </footer>
  </div>
</template>

<script>
export default {
  name: 'footer'
}
</script>

<style scoped>
  footer {
    background-color: #2d2d30;
    color: #f5f5f5;
    padding: 32px}

  .push {
    height: 50px;
  }
  p{
    color:black;
    text-align: center;
  }
 </style>
