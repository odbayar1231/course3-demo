package edu.miu.cs.cs425.demos.elibrary.controller;

import edu.miu.cs.cs425.demos.elibrary.model.Book;
import edu.miu.cs.cs425.demos.elibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value="/book/list")
//    @RequestMapping(value = "book/list", method = RequestMethod.GET)
    public ModelAndView listBooks() {
        ModelAndView modelAndView = new ModelAndView();
        List<Book> books = bookService.getBooks();
        modelAndView.addObject("books", books);
        modelAndView.addObject("bookCount", books.size());
        modelAndView.setViewName("book/list");
        return modelAndView;
    }

//    @GetMapping(value="/book/list")
//    public String listBooks2(Model model) {
//        List<Book> books = bookService.getBooks();
//        model.addAttribute("books", books);
//        return "book/list";
//    }

}
