# frozen_string_literal: true

RiceCooker = Struct.new(
  :power_on,
  :cooking,
  :warm_mode,
  :steam_mode,
  :cooking_time,
  :warm_time,
  :steam_time,
  :plugged_in
)

def plug_in(cooker)
  cooker.plugged_in = true
  puts 'The rice cooker is plugged in.'
end

def unplug(cooker)
  cooker.plugged_in = false
  cooker.power_on = false
  puts 'The rice cooker is unplugged.'
end

def power_on(cooker)
  if cooker.plugged_in
    cooker.power_on = true
    puts 'The rice cooker is turned on.'
  else
    puts 'Please plug in the rice cooker before turning it on.'
  end
end

def set_cooking_mode(cooker, time)
  unless cooker.power_on
    raise 'The rice cooker must be turned on before setting the cooking mode.'
  end

  cooker.cooking = true
  cooker.cooking_time = time
  puts "The rice cooker is in automatic cooking mode for #{time} minutes."
rescue StandardError => e
  puts e
end

def set_warm_mode(cooker, time)
  unless cooker.power_on
    raise 'The rice cooker must be turned on before setting the warm mode.'
  end

  cooker.warm_mode = true
  cooker.warm_time = time
  puts "The rice cooker is in warm mode for #{time} minutes."
rescue StandardError => e
  puts e
end

def set_steam_mode(cooker, time, steam_level)
  unless cooker.power_on
    raise 'The rice cooker must be turned on before
     setting the steam cooking mode.'
  end

  cooker.steam_mode = true
  cooker.steam_time = time
  puts "The rice cooker is in steam cooking mode at
   level #{steam_level} for #{time} minutes."
rescue StandardError => e
  puts e
end

def cancel(cooker)
  cooker.cooking = false
  cooker.warm_mode = false
  cooker.steam_mode = false
  cooker.cooking_time = 0
  cooker.warm_time = 0
  cooker.steam_time = 0
  puts 'All operations have been canceled.'
end

cooker = RiceCooker.new(
  false,
  false,
  false,
  false,
  0,
  0,
  0,
  false
)

begin
  plug_in(cooker)
  power_on(cooker)
  set_cooking_mode(cooker, 30)
  set_warm_mode(cooker, 60)
  set_steam_mode(cooker, 60, 200)
  cancel(cooker)
rescue StandardError => e
  puts e
ensure
  unplug(cooker)
end
