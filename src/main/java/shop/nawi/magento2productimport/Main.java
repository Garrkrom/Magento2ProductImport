package shop.nawi.magento2productimport;

import org.apache.commons.cli.ParseException;
import shop.nawi.magento2productimport.file.xlsx.XlsxFile;
import shop.nawi.magento2productimport.parameters.Parser;
import shop.nawi.magento2productimport.parameters.Settings;

import java.nio.file.Paths;

public class Main {

    private static Parser _parser;

    public static void main(String[] args) {

        // Parse the commandline
        try {
            _parser = new Parser(args);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(Settings.getInputFile());
        System.out.println(Settings.getManufactuererDataFile());
        System.out.println(Settings.getOutputFile());


        try {
            XlsxFile inFile = new XlsxFile(Paths.get(Settings.getInputFile()), null);
        } catch (Exception ex) {
            System.out.println("Error in input file: " + Paths.get(Settings.getInputFile() + "with exception:\n" + ex.getMessage()));
            System.exit(1);
        }

        // Parse the input file
        String[] magento2DefCols = {
            "sku",
            "store_view_code",
            "attribute_set_code",
            "product_type",
            "categories",
            "product_websites",
            "name",
            "description",
            "short_description",
            "weight",
            "product_online",
            "tax_class_name",
            "visibility",
            "price",
            "special_price",
            "special_price_from_date",
            "special_price_to_date",
            "url_key",
            "meta_title",
            "meta_keywords",
            "meta_description",
            "created_at",
            "updated_at",
            "new_from_date",
            "new_to_date",
            "display_product_options_in",
            "map_price",
            "msrp_price",
            "map_enabled",
            "gift_message_available",
            "custom_design",
            "custom_design_from",
            "custom_design_to",
            "custom_layout_update",
            "page_layout",
            "product_options_container",
            "msrp_display_actual_price_type",
            "country_of_manufacture",
            "additional_attributes",
            "qty",
            "out_of_stock_qty",
            "use_config_min_qty",
            "is_qty_decimal",
            "allow_backorders",
            "use_config_backorders",
            "min_cart_qty",
            "use_config_min_sale_qty",
            "max_cart_qty",
            "use_config_max_sale_qty",
            "is_in_stock",
            "notify_on_stock_below",
            "use_config_notify_stock_qty",
            "manage_stock",
            "use_config_manage_stock",
            "use_config_qty_increments",
            "qty_increments",
            "use_config_enable_qty_inc",
            "enable_qty_increments",
            "is_decimal_divided",
            "website_id",
            "deferred_stock_update",
            "use_config_deferred_stock_update",
            "related_skus",
            "crosssell_skus",
            "upsell_skus",
            "hide_from_product_page",
            "custom_options",
            "bundle_price_type",
            "bundle_sku_type",
            "bundle_price_view",
            "bundle_weight_type",
            "bundle_values",
            "associated_skus"
        };

        String[] magento2ReqCols = {
                "associated_skus"
        };
        System.out.println("Files parse success!");
    }
}
