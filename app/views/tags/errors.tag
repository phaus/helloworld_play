<% if errors.any? %>
  <div id="error-description">
    <h4><%= (defined?(error_msg) && error_msg) || "{pluralize(errors.count, "error")} prohibited this from being saved:" %></h4>
    <ul>
      <% errors.full_messages.each do |msg| %>
        <li><%= msg %></li>
      <% end %>
    </ul>
  </div>
<% end %>
