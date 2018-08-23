<template >
  <div class="parallax">
    <head >
      <title>QA Cinema</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
     <navigation/>
    <h1 style="color: white">Film Classifications</h1>
    <p style="color: white">All film classification decisions are based on the British Board of Film Classification's (BBFC) published and regularly updated guidelines.</p>
    <p style="color: white">For more detailed information about BBFC rulings, and for information for parents regarding film classifications and their suitability, please visit&nbsp;<a class="externalLink ActivLink" href="http://www.bbfc.co.uk/" target="_blank" data-treelink="0" data-documentlink="0" data-urllink="1" data-anchorlink="0"><span style="font-size: large;">www.bbfc.co.uk</span>&nbsp;</a></p>

    <TABLE width="35%" border="5" align="center">
      <div class="responsive">
        <TR style="font-weight:bold; color: white" >
          <TD> <a><img src="../assets/u.jpg" alt="Universal" width="100" height="100"></a></TD>
          <TD> Universal, suitable for audiences aged 4 years and over. Check with consumer advice before allowing under 4's to view this film.<br>
            Violence will generally be very mild. Mild violence may be acceptable if it is justified by context (for example, comedic, animated, wholly unrealistic)</TD>
        </TR>
      </div>

      <div class="responsive" >
        <TR style="font-weight:bold; color: white">
          <TD> <a><img src="../assets/pg.jpg" alt="Parental Guidance" width="100" height="100"></a></TD>
          <TD> Parental Guidance - General Viewing, but some scenes may be unsuitable for young children.<br>
            Unaccompanied children of any age may watch, but parents are advised to consider whether the content may upset younger, or more sensitive, children.</TD>
        </TR>
      </div>

      <div class="responsive">
        <TR style="font-weight:bold; color: white">
          <TD> <a><img src="../assets/12a.jpg" alt="12A" width="100" height="100"></a></TD>
          <TD> 12A with Parental Guidance - 12A means that the BBFC have classified the film unsuitable for children under 12.<br>
            However, they may still watch the film, as long as they are accompanied by someone over 18 at all times during the showing.<br>
            Advice is given regarding the content of the film and the ADULT must decide if it is appropriate for the accompanying under 12. Please note: proof of age may be required. </TD>
        </TR>
      </div>

      <div class="responsive">
        <TR style="font-weight:bold; color: white">
          <TD> <a><img src="../assets/15.png" alt="15" width="100" height="100"></a></TD>
          <TD> 15 - Suitable only for persons of 15 years and older. Please note: proof of age may be required. </TD>
        </TR>
      </div>

      <div class="responsive">
        <TR style="font-weight:bold; color: white">
          <TD> <a><img src="../assets/18a.png" alt="18" width="100" height="100"></a></TD>
          <TD> 18 - Suitable only for persons of 18 years and older. Please note: proof of age may be required.<br>
            Adults should be free to choose their own entertainment.</TD>
        </TR>
      </div>
    </TABLE>
    <Footer/>
  </div>
</template>

<script>
import Navigation from './navigation'
import Footer from './footer'
export default {
  name: 'ListingsGallery',
  components: {Navigation, Footer},
  data () {
    return {
    }
  }
}
</script>

<style scoped>
</style>
