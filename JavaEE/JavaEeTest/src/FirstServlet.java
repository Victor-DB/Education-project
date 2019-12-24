import somePackage.Cart;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        /**
         * Создаём обект session для хранения данных о пользователе
         * Сессия открывается при запросе клиента поэтому используем метод гет к запросу
         */
        HttpSession session = request.getSession();


        /**
         * В качестве атрибута будем передавать не просто число а целый объект класса Cart
         * Этот объект будем получать из нашей ссессии session
         * Если ничего не будем получать, то будем создавать новый объект
         * Если будем получать что-то, то будем этот объект как-то модифицировать
         */
        Cart cart = (Cart) session.getAttribute("cart");


        /**
         * Получим значения корзины (имя и количество) из URL-параметров
         *
         */
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));


        /**
         * Запишем полученные из корзины параметры в сессию
         * Для этого создадим новый объект класса Cart  и зададим ему количество
         */
        if(cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }


        /**
         * Записываем сессию пользователя с его корзиной:
         */
        session.setAttribute("cart", cart);

        /**
         *
         */

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);


        /**
         * Чтобы создать новый атрибут,например, счётик посещений странички пользователем session.setAttribute()
         * до того как использовать значение атрибута count его сначала надо вытянуть из сессии
         * метод getAttribute() возвращает объект класса объект по этому нужно сделать даункастинг до интегера
         * Если обращаемся к методу getAttribute() первый раз то он вернёт нуль так как для пользователя это атрибут count ещё не назначен
         */
         //Integer count = (Integer) session.getAttribute("count");


        /**
         * Чтобы создать корзину как при покупке товаров в инет-магазине используется атрибут cart:
         */
        //Integer count = (Integer) session.getAttribute("cart");


        /**
         * Если пользователь заходит в первый раз т.е. count = 0 то мы должны назначить ему значение = 1
         */
//        if(count == null) {
//            session.setAttribute("count", 1);
//            count = 1;


            /**
             * Если пользователь войдёт повторно, то мы будем добавлять количество посещений прибавляя к count значение 1
             */
//        } else {
//            session.setAttribute("count", count + 1);
//        }
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");


        //PrintWriter pw = response.getWriter();
        //pw.println("<html>");
        //pw.println("<h1> Your count is: " + count + " </h1>");
       // pw.println("<h1> Hello, " + name + " " + surname + "</h1>");
        //pw.println("</html>");

        // REDIRECT по URL
        // response.sendRedirect("https://www.google.com/");

        // REDIRECT на jsp-файл (перенапраыляем пользователя на страницу с ведома пользователя ( на наш jsp файл), при этом URL меняется):
        // response.sendRedirect("/testJsp.jsp");

        //FORWARD (перенаправление пользователя сервером без ведома пользователя на нужную страницу)
        //RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp");
        //Сервлет перенаправил наш запрос (request) с помощью метода forward() нашему .jsp странице без изменения URL)
        //dispatcher.forward(request, response);
    }
}
