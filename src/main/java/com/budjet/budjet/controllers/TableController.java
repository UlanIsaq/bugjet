package com.budjet.budjet.controllers;

import com.budjet.budjet.domain.Table;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/create")
public class TableController {
List<Table> listOfTable = new ArrayList<>();

    @GetMapping
    public String getTable(Model model)
    {
        model.addAttribute("table",listOfTable);
        return "table";
    }
//    @PostMapping
//    public String createProduct(@RequestParam Long ostatokNacalo,@RequestParam Long ostatokKonec,
//                                @RequestParam Long balance, @RequestParam String name,
//                                @RequestParam Integer uid)
//    {
//        listOfTable.
//                add(new Table(uid, name,
//                        ostatokNacalo, ostatokKonec, balance));
//        return "redirect:/table";
//    }
//    @GetMapping("/delete")
//    public String deleteRow(@RequestParam int uid){
//        listOfTable
//                .stream()
//                .forEach(table -> {if(table.getId()==uid){listOfTable.remove(table);}});
//
//        return "redirect:/table";
//    }
@PostMapping
public String createProduct(Table table)
{

    listOfTable.
            add(table);
    return "redirect:/table";
}

}
