<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:url value = "/view/client/assets" var="url"/>
  <!-- Start header section -->
  <jsp:include page = "./header/mainHeader.jsp" flush = "true" />
  
  
  <section id="aa-catg-head-banner">
      <img src="${pageContext.request.contextPath}/view/client/assets/images/banner_introduce.jpg" alt="banner sản phẩm" width="100%" height="460px">
   <div class="aa-catg-head-banner-area">
     <div class="container">
      <div class="aa-catg-head-banner-content">
        <h2>Giới thiệu</h2>
        <ol class="breadcrumb">
          <li><a href="${pageContext.request.contextPath}/">Trang chủ</a></li>      
          <li style="color:#fff">Giới thiệu</li>   
        </ol>
      </div>
     </div>
   </div>
  </section>
  <section id="aa-product-category">
    <div class="container">
      <div class="row">
      	<div>
      		<h1 style ="text-align: center; color: red;">Ăn Vặt 24h</h1>
      		<p>Nếu chỉ ăn mà không uống thì có lẽ chưa trọn vẹn rồi đúng không các bạn. Trà sữa, một thức uống với nhiều màu sắc khác nhau, hương vị vô cùng phong phú từ táo, đào, 
                    cam đến bạc hà, socola... <strong>Ăn Vặt 24h</strong>. Về cơ bản, trà sữa trân châu là hỗn hợp của sữa, trà vị trái cây và thêm một vài nguyên liệu khác để tăng thêm sự hấp dẫn.Trà sữa trân châu hiện tại cũng là một thức đồ uống hấp dẫn đối
                    với các bạn trẻ người Việt.</p>
      		<img src="${url}/images/introduce_1.jpg" alt="Trà Sữa"/> <br/> <br>
      		<p>Nói đến bánh tráng trộn, chắc chắn không có bạn trẻ nào là không biết hay chưa từng thưởng thức qua. Một món ăn vặt được làm từ những nguyên liệu vô cùng đơn giản, nhưng lại ẩn chứa một sự cuốn hút vô cùng hấp dẫn. 
                    Bạn đã thử món bánh tráng trộn bao giờ chưa?<br>
                    Ngày nay, khi ra đường, đâu đâu trên các vỉa hè chúng ta cũng thấy các cô, các chú cặm cụi làm nhưng bịch bánh tráng trộn cực kì ngon mắt, với đầy đủ các hương vị từ vị béo béo, bùi bùi của trứng cút, thêm cái dai dai của những sợi bánh tráng được cắt nhỏ, xen lẫn là vị chua của xoài xanh, thơm thơm của bò khô, tôm khô hòa vào cái vị nồng của rau thơm. Tất cả đều là những nguyên liệu dễ tìm nhưng lại được hòa quyện vào nhau tạo nên một món ăn tuy quen mà lạ, 
                    tuy đơn giản làm lại hấp dẫn vô cùng.
                
                </p>
      		<img src="${url}/images/introduce2.jpg" alt="Bánh Tráng Trộn" width= "1160" height= "600"/> <br/> <br>
      		<strong>Dưới đây, chúng tôi xin điểm qua những mặt hàng của Ăn Vặt 24h hiện đang được rất nhiều khách hàng tin dùng và ưa chuộng:</strong><br/>
      		<p> <strong>Trà Sữa các loại được nấu tại nhà: </strong>
			Với các loại trà sữa đầy đủ các vị <strong>Ăn vặt 24h</strong> là địa chỉ uy tín cung cấp cho bạn các các món ăn vặt được làm tại nhà
                        và đảm bảo an toàn vệ sinh, .</p>
      		<p> <strong>Bánh tráng trộn: </strong>
      		Khi đang làm việc căng thăng bánh tráng trộn là món giúp chúng giải tỏa căng thẳng một cách hiệu quả <strong>Ăn vặt 24h</strong> cung cấp các đồ ăn vặt
                đảm bảo an toàn vệ sinh
      		</p>
      		<p> <strong>Rất nhiều các loại cá viên chiên: </strong>
      		Chúng tôi cung cấp các loại cá viên ngon, giá cả phải trăng đặt biệt khi mua compo lớn sẽ được giảm giá đến 20%. 
                Còn chừng chờ gì nữa hãy nhanh tay order đi nào!
      		</p>
      		<p> <strong>Gỏi cuốn và gỏi đu đủ:</strong> Có lẻ đây là 2 món không thể thiếu trong bộ sưu tập ăn vặt nhỉ! chỉ 5 nghìn đồng 1 cuốn 
                    và 25 nghìn 1 phần gỏi đu đủ cũng đủ để các bạn mê ly.</p>
      		<br />
      	</div>
      </div>
     </div>
    </section>
    
<!--  footer-->
 <jsp:include page = "./footer/footer.jsp" flush = "true" />
<!-- end footer-->
      